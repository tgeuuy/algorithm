package acwing.AC_823;

import java.io.*;
import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_823
 * @Author: tgeuuy
 * @CreateTime: 2022-06-30  23:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static int n;
    public static boolean[] st;
    public static Deque<Integer> list;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        n = Integer.valueOf(br.readLine());
        st = new boolean[n + 1];
        list = new LinkedList<>();
        dfs(1);
        bw.flush();
        return;
    }

    public static void dfs(int p) throws IOException {
        if (list.size() == n) {
            for (int v : list) {
                bw.write((v) + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                st[i] = true;
                list.addLast(i);
                dfs(p + 1);
                list.removeLast();
                st[i] = false;
            }

        }


    }
}
