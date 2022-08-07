package javaLearn.file.file;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
        m1();
        m2();
        m3();

    }

    public static void m1() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("文件删除成功！");
            }else {
                System.out.println("文件删除失败！");
            }

        }else {
            System.out.println("文件不存在！");
        }
    }

    public static void m2() {
        String filePath = "e:\\demo2";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("文件删除成功！");
            }else {
                System.out.println("文件删除失败！");
            }

        }else {
            System.out.println("文件不存在！");
        }
    }

    public static void m3() {
        String directoryPath = "e:\\demo2\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("文件删除成功！");
            }else {
                System.out.println("文件删除失败！");
            }

        }else {
            if (file.mkdirs()){
                System.out.println("文件创建成功！");
            }else {
                System.out.println("文件创建失败！");
            }

        }
    }
}
