package acwing.AC_614;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 11:56
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a + b + Math.abs(a - b)) / 2;
        System.out.printf("%d eh o maior", (d + c + Math.abs(d - c)) / 2);
    }
}
