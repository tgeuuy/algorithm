package acwing.AC_96;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-20  19:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] f = new int[15];
        int[] g = new int[15];
        int n = sc.nextInt();
        g[1] = 1;
        for (int i = 2; i <= 12; i++) {
            g[i] = g[i - 1] * 2 + 1;
        }
        for (int i = 0; i <= 12; i++) {
            System.out.print(g[i] + " ");
        }
        Arrays.fill(f, Integer.MAX_VALUE >> 1);
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j <= i; j++) {
                f[i] = Math.min(f[i], 2 * f[j] + g[i - j]);
            }
        }

    }
}
