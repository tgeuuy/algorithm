package acwing.AC_654;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/9 15:38
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours = n / 3600;
        n = n - hours * 3600;
        int min = n / 60;
        int sec = n - min * 60;
        System.out.printf("%d:%d:%d", hours, min, sec);


    }
}
