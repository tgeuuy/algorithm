package acwing.AC_741;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 11:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            System.out.printf("Fib(%d) = %.0f\n", m, Fib(m));
        }
    }

    private static double Fib(int m) {

        if (m == 0) return 0;
        if (m == 1) return 1;
        double a = 0, b = 0, res = 1;
        for (int i = 2; i <= m; i++) {
            a = b;
            b = res;
            res = a + b;

        }
        return res;
    }
}
