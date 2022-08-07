package leetcode.leet_200;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 21:16
 * @Version 1.0
 */
public class Solution {


    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};


        int res = numIslands(grid);
        System.out.println("res=" + res);


    }


    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] st = new boolean[n][m];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!st[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j, st);
                    res++;
                }


            }
        }
        return res;

    }

    private static void dfs(char[][] grid, int x, int y, boolean[][] st) {
        if (st[x][y]) return;
        st[x][y] = true;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a < grid.length && a >= 0 && b >= 0 && b < grid[0].length && !st[a][b]&&grid[a][b]=='1') {
                dfs(grid, a, b, st);
            }

        }
    }
}