package javaLearn.file.file;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    /**
     * new File(String pathname) //根据路径构建一个File对象
     * new File(File parent,String child) //根据父目录文件 + 子路径构建
     * new File(String parent， String child) //根据父目录 +子录径构建
     * createNewFile 创建文件
     */


    public static void main(String[] args) {
        create01();
        create02();
        create03();

    }

    //new File(String pathname) //根据路径构建一个File对象
    public static void create01() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //new File(File parent,String child) //根据父目录文件 + 子路径构建
    public static void create02() {
        String parentFile = "e:\\";
        String fileName = "new2.txt";
        File file = new File(parentFile,fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //new File(String parent， String child) //根据父目录 +子路径构建
    public static void create03() {
        String parentPath = "e:\\";
        String filePath = "new2.txt";
        File file = new File(parentPath,filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
