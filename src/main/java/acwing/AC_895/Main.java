package acwing.AC_895;

import zuochengyun.intermediate.class01.Problem06_UniqueBST;

import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  17:04
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static int[] arr = new int[10010];
    public static int[] f = new int[10010];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        f[0] = 0;

        for (int i = 1; i <= n; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        for (int v : f) res = Math.max(v, res);
        System.out.println(res);


    }
}
