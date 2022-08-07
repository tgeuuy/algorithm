package acwing.AC_613;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 11:36
 * @Version 1.0
 */
public class Main {
    public static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", 0.5 * A * C);
        System.out.printf("CIRCULO: %.3f\n", PI * C * C);
        System.out.printf("TRAPEZIO: %.3f\n", 0.5 * (A + B) * C);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);


    }
}
