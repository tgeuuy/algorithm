package acwing.AC_672;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 17:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        double res = 0;
        if (sal >= 4500.01) {
            res += (sal - 4500.00) * 0.28;
            sal = 4500.00;
        }
        if (sal >= 3000.01 && sal <= 4500.00) {
            res += (sal - 3000.00) * 0.18;
            sal = 3000.00;
        }
        if (sal >= 2000.01 && sal <= 3000.00) {
            res += (sal - 2000.00) * 0.08;

        } else {
            System.out.println("Isento");
            return;
        }
        System.out.printf("R$ %.2f", res);


    }
}
