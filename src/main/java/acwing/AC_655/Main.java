package acwing.AC_655;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 15:46
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println(day / 365 + " ano(s)");
        day %= 365;
        System.out.println(day / 30 + " mes(es)");
        day %= 30;
        System.out.println(day + " dia()s");

    }
}
