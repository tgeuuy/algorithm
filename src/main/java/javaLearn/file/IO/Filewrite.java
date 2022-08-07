package javaLearn.file.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {


        File filePath = new File("e:\\write.txt");
        FileWriter fileWrite = null;
        try {
            char[] chars = {'a', 'b', 'c'};
            fileWrite = new FileWriter(filePath, true);
            fileWrite.write('A');
            fileWrite.write('\n');
            fileWrite.write("ddddddd");
            fileWrite.write("nihao  你好".toCharArray(), 0, 7);
            fileWrite.write(chars);
            fileWrite.write("你好厉害厉害",0,3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
