package acwing.AC_739;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/11 10:24
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[100];
        for (int i = 0; i < 100; i++) arr[i] = sc.nextDouble();
        for (int i = 0; i < 100; i++) {
            if (arr[i] <= 10.0) System.out.printf("A[%d]=%.1f\n", i, arr[i]);
        }
    }
}
