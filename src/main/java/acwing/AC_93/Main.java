package acwing.AC_93;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-20  15:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static int n;
    public static int m;
    public static List<Integer> res = new ArrayList<>();
    public static boolean[] st;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        st = new boolean[n + 1];
        m = sc.nextInt();
        System.out.println();
        dfs(0);
        return;
    }

    public static void dfs(int p) {
        if (res.size() == m) {
            for (int v : res) {
                System.out.print(v + " ");
            }
            System.out.println();
            return;
        }
        for (int i = p + 1; i <= n; i++) {
            if (!st[i]) {
                res.add(i);
                st[i] = true;
                dfs(i);
                res.remove(res.size() - 1);
                st[i] = false;
            }

        }

    }

}
