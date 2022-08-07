package javaLearn.file.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutFile {

    public static void main(String[] args) {
        out1();

    }


    public static void out1() {
        String file = "E:\\a.txt";
        FileOutputStream outputStream = null;
        try {
//            outputStream = new FileOutputStream(file);
            outputStream = new FileOutputStream(file, true);//文件末尾追加
            String str = "hello world! \n";
            outputStream.write(str.getBytes());
            outputStream.write(str.getBytes(), 0, str.length());
            outputStream.write('d');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
