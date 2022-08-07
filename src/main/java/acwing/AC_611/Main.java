package acwing.AC_611;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 10:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c, sum = 0;
        int d = 2;
        while (d-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextDouble();
            sum += b * c;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f", sum);

    }
}
