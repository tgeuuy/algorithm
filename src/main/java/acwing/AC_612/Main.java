package acwing.AC_612;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 11:31
 * @Version 1.0
 */
public class Main {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("VOLUME = %.3f", PI * 4 / 3.0 * r * r * r);
    }
}
