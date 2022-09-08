package bishi.meituan8_20;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] e = new long[n + 1];
        long[] g = new long[n + 1];
        for (int i = 1; i <= n; i++) e[i] = sc.nextLong();
        for (int i = 1; i <= n; i++) g[i] = sc.nextLong();

        long[][][] f = new long[n + 1][m + 1][2];
        long res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j][0] = Math.max(f[i][j - 1][1] + e[i - 1] * g[i - 1] + g[i], f[i][j - 1][0] + g[i - 1] + g[i]);
                f[i][j][1] = Math.max(f[i][j - 1][0] + g[i - 1] + g[i] * e[i], f[i][j - 1][1] + g[i - 1] * e[i - 1] + g[i] * e[i]);
                long t = Math.max(f[i][j][0], f[i][j][1]);
                res = Math.max(t, res);

            }
            System.out.println(res);
        }
        System.out.println(res);


    }
}
