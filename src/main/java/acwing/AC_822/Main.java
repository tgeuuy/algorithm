package acwing.AC_822;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 10:57
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= m; j++)
                if (i == 0 || j == 0) f[i][j] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(f[n][m]);
    }
}
