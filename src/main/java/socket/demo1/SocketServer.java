package socket.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        System.out.println("服务器启动成功！");
        while (true) {
            Socket request = serverSocket.accept();
            System.out.println("收到新连接：" + request.toString());
            InputStream inputStream = request.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            String msg;
            while ((msg = reader.readLine()) != null) {
                if (msg.length() == 0) {
                    break;
                }
                System.out.println(msg);
            }
            System.out.println("收到数据，来自："+reader.toString());
        }
    }
}
