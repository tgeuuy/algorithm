package acwing.AC_756;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_756
 * @Author: tgeuuy
 * @CreateTime: 2022-06-14  16:52
 * @Description: TODO
 * @Version: 1.0
 */
public class Soluton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int x = 0, y = 0, k = 1, d = 0; k <= n * m; k++) {
            arr[x][y] = k;
            int a = dx[d] + x, b = dy[d] + y;
            if (a < 0 || a >= n || b < 0 || b >= m || arr[a][b] != 0) {
                d = (d + 1) % 4;
                a = dx[d] + x;
                b = dy[d] + y;
            }
            x = a;
            y = b;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }

    }


}
