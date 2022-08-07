package acwing.AC_800;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_800
 * @Author: tgeuuy
 * @CreateTime: 2022-07-03  22:47
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        for (int i = 0, j = m - 1; i < n; i++) {
            while (j < m && a[i] + b[j] > x) j--;
            if (j>=0&&a[i] + b[j] == x) {
                System.out.println(i + " " + j);
                return;
            }

        }



    }
}
