package acwing.AC_616;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/9 15:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.printf("%.4f%n", Math.sqrt((Math.pow(x1 - x2, 2)) + Math.pow(y1 - y2, 2)));
    }
}
