package bishi.shenfen;

import test.Link;

import java.util.*;

public class Ti_2 {
    public static int n;
    public static int[] p, val;
    public static Map<Integer, List<Integer>> map;
    public static boolean[] st;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = new int[n + 1];
        val = new int[n + 1];
        st = new boolean[n + 1];
        p[0] = 0;
        p[1] = 1;
        val[0] = 0;
        for (int i = 2; i <= n; i++) p[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) val[i] = sc.nextInt();
        int res = 0;
        if (check()) {
            System.out.println(0);
            return;
        }
        res++;
        for (int i = 1; i <= n; i++)
            val[i]++;

        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            if (val[i] != 0 && !st[i]) {
                int max = dfs(i);
                res += max;
            }
        }


        System.out.println(res);
    }
    private static int dfs(int x) {
        if (val[x] == 0) {
            return 0;
        }
        int res = 0;
        for (int i = x; x != 1; x = p[x]) {
            if (!st[x] && val[i] != 0) {
                st[x] = true;
                res = Math.max(res, val[i]);
                dfs(i);

            }
        }
        return res;

    }
    public static boolean check() {
        for (int v : val) {
            if (v != 0) return false;
        }
        return true;
    }
}
