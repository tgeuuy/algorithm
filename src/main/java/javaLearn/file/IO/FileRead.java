package javaLearn.file.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {

    public static void main(String[] args) {
        read1();
    }

    private static void read1() {
//        File file = new File("E:/实习/代码/interface.txt");
        String str = "E:/实习/代码/interface.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(str);
            int len = 0;
            while ((len = fileReader.read()) != -1) {
                System.out.print((char) len);
            }
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read2() {
        String str = "E:/实习/代码/interface.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(str);
            int len = 0;
            char[] buf = new char[1024];
            while ((len = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len));
            }
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
