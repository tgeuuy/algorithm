//package javaLearn.nio;
//
//import java.io.IOException;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//import java.net.Socket;
//import java.nio.ByteBuffer;
//import java.nio.channels.SelectionKey;
//import java.nio.channels.Selector;
//import java.nio.channels.ServerSocketChannel;
//import java.nio.channels.SocketChannel;
//import java.nio.channels.spi.SelectorProvider;
//import java.util.*;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * @Author: sunwisepace
// * @CreateTime: 2022-07-29  23:28
// * @Description: TODO
// * @Version: 1.0
// */
//public class NIOEchoServer {
//    private Map<Socket, Long> geym_time_stat = new HashMap<>();
//
//    private ExecutorService threadPool = Executors.newFixedThreadPool(10);
//
//    private Selector selector;
//
//    public void startServer() throws IOException {
//        // [1] 准备一个Selector
//        selector = SelectorProvider.provider().openSelector();
//
//        // [2] 准备一个不阻塞的服务端Socket
//        // 意味着服务端Socket不会阻塞在accept，而是当有客户端连接时，才通知服务端执行accept接受连接
//        ServerSocketChannel ssc = ServerSocketChannel.open();
//        ssc.configureBlocking(false);
//
//        // [3] 给Socket绑定端口
//        InetSocketAddress isa = new InetSocketAddress(8888);
//        ssc.socket().bind(isa);
//
//        // [4] 给Selector注册选择事件（OP_ACCEPT、OP_CONNECT、OP_READ、OP_WRITE）
//        // 这里由于服务端Socket设置为非阻塞的，因此必须给Selector设置一个ACCEPT事件，表示当前Selector只对ACCPET作处理，
//        // 处理的具体就是让服务端accept客户端的连接请求
//        SelectionKey acceptKey = ssc.register(selector, SelectionKey.OP_ACCEPT);
//
//        // [5] 死循环轮询可执行的Channel
//        for (; ; ) {
//            selector.select();
//            // selectNow写法如下：
//            /*
//                if(0 == selector.selectNow()) {
//                    continue;
//                }
//            */
//
//            // [6] 获取可执行的SelectionKey
//            Set<SelectionKey> readyKeys = selector.selectedKeys();
//
//            // [7] 遍历处理每一个SelectionKey
//            Iterator<SelectionKey> it = readyKeys.iterator();
//            long e = 0;
//            while (it.hasNext()) {
//                SelectionKey sk = it.next();
//
//                // 让迭代体中移除当前SelectionKey，避免重复处理
//                it.remove();
//
//                // 如果Selector的事件是ACCEPT，服务端接受客户端的连接请求,具体逻辑封装在doAccept
//                if (sk.isAcceptable()) {
//                    doAccept(sk);
//
//                    // 如果Selector的事件是READ，服务端读取数据,具体逻辑封装在doRead
//                } else if (sk.isValid() && sk.isReadable()) {
//                    // 记录开始执行客户端请求的时间(毫秒)，用于计算任务的完成时间
//                    Socket socketChannel = ((SocketChannel) sk.channel()).socket();
//                    if (!geym_time_stat.containsKey(socketChannel)) {
//                        geym_time_stat.put(socketChannel, System.currentTimeMillis());
//                        doRead(sk);
//                    }
//
//                    // 如果Selector的事件是WRITE，服务端写数据,具体逻辑封装在doWrite
//                } else if (sk.isValid() && sk.isWritable()) {
//                    doWrite(sk);
//                    // 计算客户端请求的执行时间
//                    e = System.currentTimeMillis();
//                    Long b = geym_time_stat.get(((SocketChannel) sk.channel()).socket());
//                    System.out.println("spend: " + (e - b) + "ms");
//                }
//            }
//        }
//    }
//
//    // doAccept
//    private void doAccept(SelectionKey sk) {
//
//        ServerSocketChannel server = (ServerSocketChannel) sk.channel();
//        SocketChannel clientChannel = null;
//        try {
//            // [1] 获取连接的Channel
//            clientChannel = server.accept();
//            // 设置Channel为非阻塞的，只有在非阻塞下，才可以对channel设置事件
//            clientChannel.configureBlocking(false);
//
//            // [2] 设置事件，对于当前Channel来说，感性趣的是读
//            SelectionKey clientKey = clientChannel.register(selector, SelectionKey.OP_READ);
//
//            // [3] 准备一个客户端，并将客户端作为一个附件加入到SelectionKey中
//            // 主要意图是，当前Clint在后续操作中会使用到，暂时先保存起来
//            EchoClient echoClient = new EchoClient();
//            clientKey.attach(echoClient);
//
//            // [4] 打印连接信息
//            InetAddress clientAddress = clientChannel.socket().getInetAddress();
//            System.out.println("Accepted connection from " + clientAddress.getHostAddress());
//        } catch (IOException e) {
//            System.out.println("Failed to accept new client");
//            e.printStackTrace();
//        }
//    }
//
//    // doRead
//    private void doRead(SelectionKey sk) {
//        // [1] 获取当前处理的Channel
//        SocketChannel channel = (SocketChannel) sk.channel();
//
//        // [2] 准备一个Buffer，用于读写数据
//        ByteBuffer bb = ByteBuffer.allocate(8192);
//        int len;
//
//        // [3] 从Channel中读取数据到Buffer中
//        try {
//            len = channel.read(bb);
//            if (len < 0) {
//                return;
//            }
//        } catch (IOException e) {
//            System.out.println("Failed to read from client");
//            e.printStackTrace();
//            return;
//        }
//
//        // [4] 写完数据之后，对Buffer进行读写转换
//        bb.flip();
//
//        // [5] 将数据回写给客户端交由一个新的线程执行
//        // 如果具体的处理逻辑复杂，应该起一个新的线程执行
//        threadPool.submit(new HandleMsg(sk, bb));
//    }
//
//    // doWrite
//    private void doWrite(SelectionKey sk) {
//        // [1] 获取当前操作的Channel
//        SocketChannel channel = (SocketChannel) sk.channel();
//
//        // [2] 获取附件存储的ByteBuffer，进行回写操作
//        EchoClient echoClient = (EchoClient) sk.attachment();
//        LinkedList<ByteBuffer> outq = echoClient.getOutputQueue();
//
//        ByteBuffer bb = outq.getLast();
//
//        try {
//            int len = channel.write(bb);
//            if (-1 == len) {
//                return;
//            }
//
//            if (0 == bb.remaining()) {
//                outq.removeLast();
//            }
//        } catch (IOException e) {
//            System.out.println("Failed to write to client");
//            e.printStackTrace();
//        }
//
//        // 当数据回写完毕之后，当前Channel不应该再对WRITE事件感性趣，因此这里设置为READ
//        if (0 == outq.size()) {
//            sk.interestOps(SelectionKey.OP_READ);
//        }
//    }
//}
//
//
