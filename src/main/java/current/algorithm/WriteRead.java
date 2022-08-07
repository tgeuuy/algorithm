package current.algorithm;


class DataFile {
    private int readCount;
    private boolean doread;
    private boolean dowrite;

    public DataFile() {
        readCount = 0;
        doread = false;
        dowrite = false;
    }

    public void naps() {
        try {
            Thread.sleep((int) (4000 * Math.random()));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int startRead() {
        while (doread == true) {
            try {
                System.out.println(Thread.currentThread().getName() + "is reading!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "begin to read ");
            readCount++;
            if (readCount == 1) {
                doread = true;
            }


        }
        return readCount;
    }


    public synchronized int endRead() {
        --readCount;
        if (readCount == 0) {
            doread = false;
        }
        notify();
        System.out.println(Thread.currentThread().getName() + "reading done!");

        return readCount;
    }

    public synchronized void startWrite() {
        while (doread == true || dowrite == true) {

            try {
                System.out.println(Thread.currentThread().getName() + "is waiting");
                //等待读者或者写者发出信息
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println(Thread.currentThread().getName() + "begin to write");
        dowrite = true;

    }

    public synchronized void endWrite() {
        dowrite = false;
        notify();
        System.out.println(Thread.currentThread().getName() + "writing done!");
    }


}

class Reader implements Runnable {
    private int readNum;
    private DataFile df;

    Reader(int readNum, DataFile df) {
        this.readNum = readNum;
        this.df = df;
    }

    @Override
    public void run() {
        System.out.println("reader" + readNum + "     comes here");
        df.naps();
        df.startRead();
        df.naps();
        df.endRead();
    }
}

class Writer implements Runnable {
    private int writeNum;
    private DataFile df;

    Writer(int writeNum, DataFile df) {
        this.writeNum = writeNum;
        this.df = df;
    }

    @Override
    public void run() {
        System.out.println("writing" + writeNum + "     comes here");
        df.naps();
        df.startWrite();
        df.naps();
        df.endRead();
    }
}


class WriteRead {
    public static void main(String[] args) {
        DataFile df = new DataFile();


        Reader r1 = new Reader(1, df);
        Reader r2 = new Reader(2, df);
        Reader r3 = new Reader(3, df);
        Reader r4 = new Reader(4, df);

        Writer w1 = new Writer(1, df);
        Writer w2 = new Writer(2, df);
        Writer w3 = new Writer(3, df);

        new Thread(r1, "读者线程r1   ").start();
        new Thread(r2, "读者线程r2   ").start();
        new Thread(r3, "读者线程r3   ").start();
        new Thread(r4, "读者线程r4   ").start();
        new Thread(w1, "写者线程w1   ").start();
        new Thread(w2, "写者线程w2   ").start();
        new Thread(w3, "写者线程w3   ").start();


    }
}



