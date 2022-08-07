package currAlgo;

import java.util.concurrent.Semaphore;

public class ShunXuDaYing3 {

    public static void main(String[] args) {
        Semaphore sa = new Semaphore(1);
        Semaphore sb = new Semaphore(0);
        Semaphore sc = new Semaphore(0);
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    sa.acquire();
                    System.out.print("A");
                    sb.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    sb.acquire();
                    System.out.print("B");
                    sc.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    sc.acquire();
                    System.out.print("C");
                    sa.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
