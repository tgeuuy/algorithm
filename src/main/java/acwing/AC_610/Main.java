package acwing.AC_610;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 11:50
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double sal = sc.nextDouble();
        double com = sc.nextDouble();
        System.out.printf("TOTAL = R$ %.3f", sal + com * 0.15);
    }
}
