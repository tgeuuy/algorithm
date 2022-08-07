package acwing.AC_663;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 11:15
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a < b) {
            if (b < c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                if (a < c) {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                }
            }
        } else {
            if (a < c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                if (b < c) {
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                    System.out.println(a);
                }
            }
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
