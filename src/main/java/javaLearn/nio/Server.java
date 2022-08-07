package javaLearn.nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-29  23:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Server {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        ServerSocket echoSocket = null;
        try {
            echoSocket = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true) {
            try {
                Socket clientSocket = echoSocket.accept();
                System.out.println(clientSocket.getRemoteSocketAddress() + " connected！");
                threadPool.submit(new HandleMsg(clientSocket));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
