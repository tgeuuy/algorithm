package acwing.AC_744;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 11:38
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] nums = new double[12][12];
        String str = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                nums[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += nums[i][n];
        }


        System.out.printf("%.1 f", str.equals("S") ? sum : sum / 12.0);


    }
}
