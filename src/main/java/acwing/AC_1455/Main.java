package acwing.AC_1455;

import java.util.Scanner;

public class Main {
    public static final int N = 1010;
    public static int[] arr = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t <T ; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) arr[i] = sc.nextInt();
            int res = 0;
            for (int i = 2, j = (n - 1) % m; i <= n; i++) {
                res = (res + arr[(j - 1 + m) % m]) % i;
                j = (j - 1 + m) % m;
            }
            System.out.println(res);
        }

    }
}
