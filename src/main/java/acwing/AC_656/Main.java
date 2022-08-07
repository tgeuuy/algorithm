package acwing.AC_656;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 15:15
 * @Version 1.0
 */


/**
 * NOTAS:
 * 5 nota(s) de R$ 100.00
 * 1 nota(s) de R$ 50.00
 * 1 nota(s) de R$ 20.00
 * 0 nota(s) de R$ 10.00
 * 1 nota(s) de R$ 5.00
 * 0 nota(s) de R$ 2.00
 * MOEDAS:
 * 1 moeda(s) de R$ 1.00
 * 1 moeda(s) de R$ 0.50
 * 0 moeda(s) de R$ 0.25
 * 2 moeda(s) de R$ 0.10
 * 0 moeda(s) de R$ 0.05
 * 3 moeda(s) de R$ 0.01
 */
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("NOTAS:");
        int sum = (int) (n * 100);
        System.out.println(sum / 10000 + " nota(s) de R$ 100.00");
        sum %= 10000;
        System.out.println(sum / 5000 + " nota(s) de R$ 50.00");
        sum %= 5000;

        System.out.println(sum / 2000 + " nota(s) de R$ 20.00");
        sum %= 2000;
        System.out.println(sum / 1000 + " nota(s) de R$ 10.00");
        sum %= 1000;
        System.out.println(sum / 500 + " nota(s) de R$ 5.00");
        sum %= 500;
        System.out.println(sum / 200 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        sum %= 200;
        System.out.println(sum / 100 + " nota(s) de R$ 1.00");
        sum %= 100;
        System.out.println(sum / 50 + " nota(s) de R$ 0.50");
        sum %= 50;
        System.out.println(sum / 25 + " nota(s) de R$ 0.25");
        sum %= 25;
        System.out.println(sum / 10 + " nota(s) de R$ 0.10");
        sum %= 10;
        System.out.println(sum / 5 + " nota(s) de R$ 0.05");
        sum %= 5;
        System.out.println(sum + " nota(s) de R$ 0.01");


    }
}
