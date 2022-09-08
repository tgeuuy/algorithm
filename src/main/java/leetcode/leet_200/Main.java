package leetcode.leet_200;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] st;

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int res = numIslands(grid);
        System.out.println(res);


    }

    public static int numIslands(char[][] grid) {
        int res = 0;
        int n = grid.length, m = grid[0].length;
        st = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !st[i][j]) {
                    dfs(i, j, grid);
                    res++;
                }
            }
        }
        return res;

    }

    private static void dfs(int x, int y, char[][] grid) {
        if (grid[x][y] == '0') return;
        st[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < grid.length && b >= 0 && b < grid[0].length && !st[a][b]) {
                dfs(a, b, grid);
            }
        }
    }
}
