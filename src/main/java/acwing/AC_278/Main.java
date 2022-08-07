package acwing.AC_278;

import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-22  15:45
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static int N = 101;
    public static int M = 10005;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[N];
        int[] f = new int[M];
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();
        for(int i = 1 ; i <= n ; i++) {
            for (int j = m; j >= arr[i] ; j--) {
                f[j] = f[j] + f[j-arr[i]];
            }
        }
        System.out.println(f[m]);

    }
}
