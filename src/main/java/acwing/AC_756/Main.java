package acwing.AC_756;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/10/26 9:36
 * @Version 1.0
 * 蛇形矩阵
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matix = new int[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int x = 0, y = 0, k = 1, d = 0; k <= m * n; k++) {
            matix[x][y] = k;
            int a = x + dx[d], b = y + dy[d];
            if (a < 0 || a >= n || b < 0 || b >= m || matix[a][b] != 0) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
