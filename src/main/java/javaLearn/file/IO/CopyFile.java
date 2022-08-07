package javaLearn.file.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srePath = "C:\\Users\\tgeuuy\\Music\\安静 - 周杰伦.mp3";
        String descPath = "E:\\安静 - 周杰伦.mp3";

        try {
            fileInputStream = new FileInputStream(srePath);
            fileOutputStream = new FileOutputStream(descPath);


            byte[] buf = new byte[1024];
            int readLine = 0;
            while ((readLine = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLine);
            }
            System.out.println("拷贝成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
