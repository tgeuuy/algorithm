package currAlgo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShunXuDaYing1 {

    private int time;
    private int state;
    private Lock lock = new ReentrantLock();

    public ShunXuDaYing1(int time) {
        this.time = time;
    }

    public static void main(String[] args) {
        ShunXuDaYing1 loopThread = new ShunXuDaYing1(15);
        new Thread(() -> {
            loopThread.printLetter("A", 0);
        }, "A").start();
        new Thread(() -> {
            loopThread.printLetter("B", 1);
        }, "B").start();
        new Thread(() -> {
            loopThread.printLetter("C", 2);
        }, "C").start();
    }

    private void printLetter(String name, int targetNum) {
        for (int i = 0; i < time;) {
            lock.lock();
            if (state % 3 == targetNum) {
                state++;
                i++;
                System.out.print(name);
            }
            lock.unlock();
        }
    }
}
