package acwing.AC_811;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 11:05
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println(n+" "+m);
    }
}
