package acwing.AC_897;

import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  18:43
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        int[][] f = new int[1005][1005];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String a = sc.next();
        String b = sc.next();

        for (int i = 1; i <= x; i++) {
            f[i][0] = 0;
            for (int j = 1; j <= y; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) f[i][j] = Math.max(f[i - 1][j - 1] + 1, f[i][j]);
                else f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
            }
        }
        System.out.println(f[x][y]);

    }
}
