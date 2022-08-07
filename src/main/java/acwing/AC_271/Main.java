package acwing.AC_271;

import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  16:14
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static long[][][][][] f = new long[31][31][31][31][31];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            for (int i = 0; i < 31; i++) {
                for (int j = 0; j < 31; j++) {
                    for (int k = 0; k < 31; k++) {
                        for (int l = 0; l < 31; l++) {
                            for (int m = 0; m < 31; m++) {
                                f[i][j][k][l][m] = 1;
                            }
                        }
                    }
                }
            }
            int[] arr = new int[5];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            f[0][0][0][0][0] = 1;
            for (int i = 0; i <= arr[0]; i++) {
                for (int j = 0; j <= Math.min(i, arr[1]); j++) {
                    for (int k = 0; k <= Math.min(j, arr[2]); k++) {
                        for (int l = 0; l <= Math.min(k, arr[3]); l++) {
                            for (int m = 0; m <= Math.min(l, arr[4]); m++) {
                                long x = f[i][j][k][l][m];
                                if (i > 0 && i - 1 >= j) f[i][j][k][l][m] += f[i - 1][j][k][l][m];
                                if (j > 0 && j - 1 >= k) f[i][j][k][l][m] += f[i][j - 1][k][l][m];
                                if (k > 0 && k - 1 >= l) f[i][j][k][l][m] += f[i][j][k - 1][l][m];
                                if (l > 0 && l - 1 >= m) f[i][j][k][l][m] += f[i][j][k][l - 1][m];
                                if (m > 0) f[i][j][k][l][m] += f[i][j][k][l][m - 1];
                            }
                        }
                    }
                }
            }
            System.out.println(f[arr[0]][arr[1]][arr[2]][arr[3]][arr[4]]);


        }
    }
}
