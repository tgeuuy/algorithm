package acwing.AC_1048;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/10/31 10:17
 * @Version 1.0
 */
public class Main {
    public static final int N = 105;
    public static final int M = 13;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] f = new int[N][M];
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    f[i][j] = f[i - 1][j] + f[i - 1][j - 1] + 1;
                }
                if (f[i][m] >= n) {
                    System.out.println(i);
                    break;
                }

            }
        }


    }

}
