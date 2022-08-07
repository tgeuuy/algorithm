package acwing.AC_755;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 16:36
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            if (n == 1) {
                System.out.println("1");
                System.out.println();
                continue;
            }

            double[][] nums = new double[n][n];
            for (int i = 0; i < n; i++) {
                double t = Math.pow(2, i);
                for (int j = 0; j < n; j++) {
                    nums[i][j] = t;
                    t *= 2;
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%.0f ", nums[i][j]);
                }
                System.out.println();
            }
            System.out.println();


        }

    }
}