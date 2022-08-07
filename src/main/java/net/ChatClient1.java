package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;

public class ChatClient1 {

    private final int port = 8899;
    private final String seperator = "|";
    private final Charset charset = Charset.forName("UTF-8");	//字符集
    private ByteBuffer buffer = ByteBuffer.allocate(1024);
    private SocketChannel _self;
    private Selector selector;
    private String name = "";
    private boolean flag = true;	//服务端断开，客户端的读事件不会一直发生（与服务端不一样）

    Scanner scanner = new Scanner(System.in);
    public void startClient() throws IOException{
        //客户端初始化固定流程：4步
        selector = Selector.open();								//1.打开Selector
        _self = SocketChannel.open(new InetSocketAddress(port));//2.连接服务端，这里默认本机的IP
        _self.configureBlocking(false);							//3.配置此channel非阻塞
        _self.register(selector, SelectionKey.OP_READ);			//4.将channel的读事件注册到选择器

        /*
         * 因为等待用户输入会导致主线程阻塞
         * 所以用主线程处理输入，新开一个线程处理读数据
         */
        new Thread(new ClientReadThread()).start();	//开一个异步线程处理读
        String input = "";
        while(flag){
            input = scanner.nextLine();
            if("".equals(input)){
                System.out.println("不允许输入空串！");
                continue;
            }else if("".equals(name)){  //姓名如果没有初始化
                //啥也不干，之后发给服务端验证姓名
            }else if(!"".equals(name)) {  //如果姓名已经初始化，那么说明现在的字符串就是想说的话
                input = input + seperator + name;
            }
            try{
                _self.write(charset.encode(input));
            }catch(Exception e){
                System.out.println(e.getMessage()+"客户端主线程退出连接！！");
            }
        }
    }

    private class ClientReadThread implements Runnable{
        @Override
        public void run(){
            Iterator<SelectionKey> ikeys;
            SelectionKey key;
            SocketChannel client;
            try {
                while(flag){
                    selector.select();	//调用此方法一直阻塞，直到有channel可用
                    ikeys = selector.selectedKeys().iterator();
                    while(ikeys.hasNext()){
                        key = ikeys.next();
                        if(key.isReadable()){	//处理读事件
                            client = (SocketChannel) key.channel();
                            //这里的输出是true，从selector的key中获取的客户端channel，是同一个
//							System.out.println("client == _self:"+ (client == _self));
                            buffer.clear();
                            StringBuilder msg = new StringBuilder();
                            try{
                                while(client.read(buffer) > 0){
                                    buffer.flip();	//将写模式转换为读模式
                                    msg.append(charset.decode(buffer));
                                }
                            }catch(IOException en){
                                System.out.println(en.getMessage()+",客户端'"+key.attachment().toString()+"'读线程退出！！");
                                stopMainThread();
                            }

                            if (msg.toString().contains("您的昵称通过验证")) {
                                String[] returnStr = msg.toString().split(" ");
                                name = returnStr[1];
                                key.attach(name);
                            }
                            System.out.println(msg.toString());
                        }
                        ikeys.remove();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void stopMainThread(){
        flag = false;
    }

    public static void main(String[] args){
        try {
            new ChatClient1().startClient();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
