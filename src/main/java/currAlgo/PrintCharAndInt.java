package currAlgo;

public class PrintCharAndInt {

    static Object obj = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (obj) {
                    obj.notifyAll();

                    System.out.print(i);
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
       Thread t2 =  new Thread(() -> {
            for (char i = 'a'; i <= 'z'; i++) {
                synchronized (obj) {
                    obj.notifyAll();
                    System.out.print(i);
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
       t1.start();
       t2.start();
    }
}
