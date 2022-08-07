package zati.test;


public class Demo2 {
    public  static Object object = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (object){
                    object.notifyAll();
                    System.out.print( i);
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();

        new Thread(()->{
                for (char i = 'a'; i <= 'z'; i++) {
                    synchronized (object) {
                        object.notifyAll();
                        System.out.print( i);
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }
        }).start();

    }

}
