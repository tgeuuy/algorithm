package javaLearn.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-29  23:20
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8888);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            writer.println("Hello!");
            writer.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("from server: " + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close resources
        }
    }
}
