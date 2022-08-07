package currAlgo;

public class ShunXuDaYing2 {
    private int state;
    private int times;
    private Object ob = new Object();


    private ShunXuDaYing2(int times) {
        this.times = times;
    }

    public void printChar(String str, int tarNum){
        for (int i = 0; i < times; ) {
            synchronized (ob){
                ob.notify();
                if (state % 3 == tarNum) {
                    state++;
                    i++;
                    System.out.print(str);
                }
                try {
                    ob.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static void main(String[] args) {

        ShunXuDaYing2 shunXuDaYing2 = new ShunXuDaYing2(10);
        new Thread(() -> {
            shunXuDaYing2.printChar("A", 0);
        }).start();
        new Thread(() -> {
            shunXuDaYing2.printChar("B", 1);
        }).start();
        new Thread(() -> {
            shunXuDaYing2.printChar("C", 2);
        }).start();
    }
}
