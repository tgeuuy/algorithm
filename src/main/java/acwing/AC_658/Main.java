package acwing.AC_658;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 16:05
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0 || a == 0) System.out.println("Impossivel calcular");
        else {

            System.out.printf("R1 = %.5f\n", ((-1) * b + Math.sqrt(delta)) / (2 * a));
            System.out.printf("R2 = %.5f", ((-1) * b - Math.sqrt(delta)) / (2 * a));

        }


    }
}
