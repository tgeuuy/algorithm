package acwing.AC_606;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/30 9:55
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        System.out.println("MEDIA = " + String.format("%.5f", (A * 0.35f + B * 0.75f)));
    }
}
