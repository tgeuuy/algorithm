package leetcode.leet_62;

import org.junit.Test;

public class Solution {

    public int re = 0;
    public int[] dx = { 1, 0};
    public int[] dy = { 0, 1};

    public void dfs(boolean[][] mark, int x, int y) {
        System.out.println("(x=" + x + ",y=" + y + ")");
        if (x == mark.length - 1 && y == mark[0].length - 1) {
            mark[x][y] = false;

            re += 1;
            System.out.println();
            return;
        }
        for (int i = 0; i < 2; ++i) {
            int x1 = dx[i] + x, y1 = dy[i] + y;
            if (x1 >= 0 && x1 < mark.length && y1 >= 0 && y1 < mark[0].length && mark[x1][y1] == false) {
                mark[x1][y1] = true;
                dfs(mark, x1, y1);
                mark[x1][y1] = false;
            }

        }
    }

    public int uniquePaths(int m, int n) {
        boolean[][] mark = new boolean[m][n];
        mark[0][0] = true;
        dfs(mark, 0, 0);
        return re;
    }

    @Test
    public void practice() {
        int res = uniquePaths(7, 3);
        System.out.println("res=" + res);
    }
}
