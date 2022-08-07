package acwing.AC_796;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_796
 * @Author: tgeuuy
 * @CreateTime: 2022-06-28  18:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 1005;
    public static int[][] arr = new int[MAXSIZE][MAXSIZE];
    public static int[][] pre = new int[MAXSIZE][MAXSIZE];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + arr[i][j];
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(pre[i][j] + " ");
            }
            System.out.println();
        }

        while (k-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int res = pre[x2][y2] - pre[x2][y1 - 1] - pre[x1 - 1][y2] + pre[x1 - 1][y1 - 1];
            System.out.println(res);
        }

    }
}
