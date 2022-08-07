package javaLearn.file.IO;

import java.io.*;

public class InFile {
    public static void main(String[] args) {
        in1();
        System.out.println();
        in2();

    }

    public static void in1() {
        File file = new File("e:\\news1.txt");
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            int count = 0;
            while ((count = inputStream.read()) != -1) {
                System.out.print((char) count);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void in2() {
        File file = new File("e:\\news1.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[8];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
