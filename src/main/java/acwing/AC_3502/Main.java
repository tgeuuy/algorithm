package acwing.AC_3502;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static Set<Integer> hashSet = new HashSet<>();
    public static int n, m, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j]);
                dfs(i, j, 1, arr[i][j], arr);
            }
        }
//        Iterator<Integer> it = hashSet.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        System.out.println(hashSet.size());


    }

    private static void dfs(int x, int y, int l, int num, int[][] arr) {
        if (l == k + 1) {
            hashSet.add(num);
        } else {
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a >= 0 && a < n && b >= 0 && b < m) {
                    dfs(a, b, l + 1, num * 10 + arr[a][b], arr);
                }
            }
        }
    }
}
