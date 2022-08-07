package zati.test;

public class Demo3 {
    static int num = 1;
    static char ch = 'a';
    static Object lock = new Object();
    public static void main(String[] args) {
        MyPrint myPrint = new MyPrint();
        new Thread(()->{
            myPrint.printchar(ch);
            ch++;
        }).start();
        new Thread(()->{
            myPrint.printnum(num);
            num++;
        }).start();
    }
}
