package acwing.AC_754;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 15:27
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

            int[][] nums = new int[n][n];
            for (int i = 0; i < n; i++) {
                int t = i + 1;
                for (int j = 0; j <= i; j++) {
                    nums[i][j] = t--;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= i; j--) {
                    nums[i][j] = nums[j][i];
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();


        }

    }
}
