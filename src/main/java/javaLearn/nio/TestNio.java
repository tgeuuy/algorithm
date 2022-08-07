package javaLearn.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-29  23:02
 * @Description: TODO
 * @Version: 1.0
 */
public class TestNio {


    public static void main(String[] args) throws IOException {
        String ressource = "E:/code/java/Algorithm/src/main/java/javaLearn/深入理解Java虚拟机：JVM高级特性与最佳实践（第3版） - 周志明.pdf";
        String destination = "E:/code/java/Algorithm/src/main/java/javaLearn/testCopy.pdf";
        nioCopyFile(ressource, destination);
    }

    private static void nioCopyFile(String ressource, String destination) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        FileChannel readChannel = null;

        FileChannel writeChannel = null;

        try {
            fis = new FileInputStream(ressource);
            fos = new FileOutputStream(destination);

            readChannel = fis.getChannel();
            writeChannel = fos.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while (true) {
                byteBuffer.clear();
                int len = readChannel.read(byteBuffer);
                if (-1 == len) {
                    break;
                }
            }
            byteBuffer.flip();
            writeChannel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
            readChannel.close();
            writeChannel.close();
        }


    }
}
