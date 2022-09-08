package leetcode.leet_695;

import leetcode.leet_200.Main;

public class Solution {


    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] st;

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {
                0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {
                0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {
                0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};


        int res = maxAreaOfIsland(grid);
        System.out.println(res);


    }

    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int n = grid.length, m = grid[0].length;
        st = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !st[i][j]) {

                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }
        return res;

    }

    private static int dfs(int x, int y, int[][] grid) {
        if (grid[x][y] == 0) return 0;
        st[x][y] = true;
        int res = 1;
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < grid.length && b >= 0 && b < grid[0].length && !st[a][b]) {
                res += dfs(a, b, grid);
            }
        }
        return res;
    }
}
