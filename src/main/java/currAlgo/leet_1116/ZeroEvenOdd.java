package currAlgo.leet_1116;

import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    //    Object object = new Object();
    Semaphore sz = new Semaphore(1);
    Semaphore se = new Semaphore(0);
    Semaphore so = new Semaphore(0);


    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        new Thread(() -> {
//            System.out.println("zero");
            for (int i = 1; i <= n; i++) {
                try {
                    sz.acquire();
                    printNumber.accept(0);
                    if (i % 2 == 0) {
                        se.release();
                    } else
                        so.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        new Thread(() -> {
            for (int i = 2; i <= n; i += 2) {
//                System.out.println("even");

                try {
                    se.acquire();
                    printNumber.accept(i);
                    sz.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        new Thread(() -> {
//            System.out.println("odd");
            for (int i = 1; i <= n; i += 2) {

                try {
                    so.acquire();
                    printNumber.accept(i);
                    sz.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }


    public static void main(String[] args) throws InterruptedException {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(10);
        IntConsumer printNumber = new IntConsumer();
        zeroEvenOdd.even(printNumber);
        zeroEvenOdd.zero(printNumber);
        zeroEvenOdd.odd(printNumber);
    }
}
