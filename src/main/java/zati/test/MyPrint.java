package zati.test;

public class MyPrint {
    boolean flag = true;

    public MyPrint(){

    }

    public synchronized  void printchar(char num){
        if(flag==true){
            try {
                wait();
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(num);
            notifyAll();
        }
        flag = false;


    }
    public synchronized  void printnum(int num){
        if(flag==false){
            try {
                wait();
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(num);
            notifyAll();
            flag = true;
        }




    }

}
