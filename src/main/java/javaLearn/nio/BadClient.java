package javaLearn.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.channels.Selector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-29  23:23
 * @Description: TODO
 * @Version: 1.0
 */
public class BadClient implements Runnable{
    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    private static final int SLEEP_TIME = 1000;

    @Override
    public void run() {
        try {
            Socket clientSocket = new Socket("localhost", 8888);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            writer.print("Hello!");
            // 线程休眠6S，模拟客户端的低效率（网络延迟）
            Thread.sleep(6000);
            // readLine接口主要接收到nr才会认为读到一行，并返回
            writer.println();

            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("from server: " + br.readLine());
            Selector s = Selector.open();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // close resources
        }
    }

    public static void main(String[] args) {
        // 启动10个客户端
        for (int i = 0; i < 10; i++) {
            threadPool.submit(new BadClient());
        }
    }

}
