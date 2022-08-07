package acwing.AC_898;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 19:50
 * @Version 1.0
 */
public class Main {
    public static final int MAX = 505;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[MAX][MAX];
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[MAX][MAX];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        dp[1][1] = arr[1][1];
        int res = Integer.MIN_VALUE;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];

            }
        }
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, dp[n][i]);
        }

        System.out.println(res);

    }
}
