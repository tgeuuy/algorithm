package acwing.AC_827;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-06  23:09
 * @Description: TODO
 * @Version: 1.0
 */
import java.util.Scanner;
public class Main{
    static int N = 100010;
    static int[] e = new int[N];
    static int[] r = new int[N];
    static int[] l = new int[N];
    static int idx;

    //删除第k位插入的数
    public static void remove(int k){
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }
    //这是在第k位数后面插入一个数x
    public static void add_all(int k,int x){
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx++;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        r[0] = 1;l[1] = 0;idx = 2;

        while(m -- > 0){
            String s = scan.next();
            char op = s.charAt(0);
            if(op == 'L'){
                int x = scan.nextInt();
                add_all(0,x);
            }else if(op == 'R'){
                int x = scan.nextInt();
                add_all(l[1],x);
            }else if(op == 'D'){
                int k = scan.nextInt();
                remove(k + 1);
            }else if(s.equals("IR")){
                int k  = scan.nextInt();
                int x = scan.nextInt();
                add_all(k + 1,x);
            }else {
                int k = scan.nextInt();
                int x = scan.nextInt();
                add_all(l[k+1],x);
            }
        }
        for(int i = r[0];i != 1; i= r[i]){
            System.out.print(e[i]  + " ");
        }
    }
}