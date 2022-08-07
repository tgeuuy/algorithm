package javaLearn.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-29  23:19
 * @Description: TODO
 * @Version: 1.0
 */
public class HandleMsg implements Runnable {

    private Socket clientSocket;

    public HandleMsg(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            // 记录处理时间
            long startTime = System.currentTimeMillis();
            // 回写客户端的信息
            writer.println(br.readLine());
            // 打印处理时间
            System.out.println("spend: " + (System.currentTimeMillis() - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
        }
    }
}