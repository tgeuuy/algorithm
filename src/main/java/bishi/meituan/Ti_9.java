package bishi.meituan;

import java.util.Scanner;

public class Ti_9 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a < 11 && b < 10)System.out.println(11 -a);
        else if(a == 11 && b <= 9) System.out.println(0);
        else  System.out.println( b + 2 - a);
    }
}
