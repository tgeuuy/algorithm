package acwing.AC_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-20  16:20
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static int n;
    public static List<Integer> res = new ArrayList<>();
    public static boolean[] st;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        st = new boolean[n + 1];
        dfs(0);
        return;
    }

    public static void dfs(int p) {
        if (res.size() == n || p == n) {
            for (int v : res) System.out.print(v + " ");
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                res.add(i);
                st[i] = true;
                dfs(p + 1);
                res.remove(res.size() - 1);
                st[i] = false;

            }
        }

    }
}
