package acwing.AC_743;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/11 10:37
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        double[][] arr = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (double v : arr[n]) sum += v;
        System.out.printf("%.1f", s.equals("S") ? sum : sum / 12.0);
    }
}
