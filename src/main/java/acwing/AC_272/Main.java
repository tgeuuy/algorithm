package acwing.AC_272;

import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  19:07
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int N = 3005;

    public static void main(String[] args) {
        int[] a = new int[N];
        int[] b = new int[N];
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[][] f = new int[N][N];
        for (int i = 1; i <= n; i ++) a[i] = sc.nextInt();
        for (int i = 1; i <= n; i ++) b[i] = sc.nextInt();
        for (int i = 1; i <= n; i ++) {
            int max = 1;
            for (int j = 1; j <= n; j++) {
                f[i][j] = f[i - 1][j ];
                if(a[i] == b[j] ) f[i][j] = max;
                if(a[i] > b[j] ) max = Math.max(f[i][j] + 1, max  );

            }
        }
        int res = 0;
        for (int i = 0; i <= n ; i++) res = Math.max(res, f[n][i]);
        System.out.println(res);
    }
}
