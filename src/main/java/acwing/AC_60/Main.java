package acwing.AC_60;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 16:20
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[][] grid = {{2, 3, 1}, {1, 7, 1}, {4, 6, 1}};
        int res = getMaxValue(grid);
        System.out.println("res=" + res);
    }

    private static int getMaxValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[n][m];
    }

}
