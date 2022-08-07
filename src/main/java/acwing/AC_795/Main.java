package acwing.AC_795;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_795
 * @Author: tgeuuy
 * @CreateTime: 2022-06-27  22:03
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 100005;
    public static int[] arr = new int[MAXSIZE];
    public static int[] pre = new int[MAXSIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            pre[i] = pre[i - 1] + arr[i];
        }

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(pre[b] - pre[a-1]);
        }
    }
}
