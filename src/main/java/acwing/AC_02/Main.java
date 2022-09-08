package acwing.AC_02;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int V = sc.nextInt();
//        int[] v = new int[N + 1];
//        int[] w = new int[N + 1];
//
//        for (int i = 1; i <= N; i++) {
//            v[i] = sc.nextInt();
//            w[i] = sc.nextInt();
//        }
//        int[][] f = new int[N + 1][V + 1];
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 0; j <= V; j++) {
//                f[i][j] = f[i-1][j];
//                if(v[i] <= j) f[i][j] = Math.max(f[i-1][j],f[i-1][j-v[i]]+w[i]);
//            }
//        }
//        System.out.println(f[N][V]);
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int[] v = new int[N + 1];
        int[] w = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int[] f = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = V; j >= v[i]; j--) {
                f[j] = Math.max(f[j], f[j - v[i]] + w[i]);
            }
        }
        System.out.println(f[V]);
    }
}
