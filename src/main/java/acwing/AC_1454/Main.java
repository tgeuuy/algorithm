package acwing.AC_1454;

import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);

    public static boolean isPirme(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n + 1];
        int mod = (int) 1e9 + 7;
        for (int i = 1; i <= n; i++) {
            nums[i] = cin.nextInt();
        }
        int m = 8192;
        int[][] dp = new int[n + 1][m];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = dp[i - 1][j];
                int t = j ^ nums[i];
                if (t < m) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][t]) % mod;
                }
            }
        }
        long res = 0;
        for (int i = 2; i < m; i++) {
            if (isPirme(i)) {
                res = (res + dp[n][i]) % mod;
            }
        }
        System.out.println(res);
    }
}