package leetcode.leet_63;

public class Solution {


    public static void main(String[] args) {


        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int res = uniquePathsWithObstacles(arr);
        System.out.println("res= " + res);
    }

//    static int res = 0;
//
//    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        if (obstacleGrid.length == 1 && obstacleGrid[0][0] == 1) return 1;
//        int n = obstacleGrid.length;
//        int m = obstacleGrid[0].length;
//        boolean[][] st = new boolean[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (obstacleGrid[i][j] == 1) st[i][j] = true;
//            }
//        }
//        st[0][0] = true;
//        dfs(obstacleGrid, 0, 0, st);
//        return res;
//    }
//
//    private static void dfs(int[][] obstacleGrid, int x, int y, boolean[][] st) {
//        if (x == obstacleGrid.length - 1 && y == obstacleGrid[0].length - 1) {
//            res++;
//            return;
//        }
//        if (x + 1 < obstacleGrid.length && y < obstacleGrid[0].length && st[x + 1][y] == false) {
//
//            st[x + 1][y] = true;
//            dfs(obstacleGrid, x + 1, y, st);
//            st[x + 1][y] = false;
////            System.out.println("x = " + x + "   y = " + y);
//
//        }
//        if (x < obstacleGrid.length && y + 1 < obstacleGrid[0].length && st[x][y + 1] == false) {
//
//            st[x][y + 1] = true;
//            dfs(obstacleGrid, x, y + 1, st);
//            st[x][y + 1] = false;
////            System.out.println("x = " + x + "   y = " + y);
//
//        }
//    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n ; i++) {
            if (obstacleGrid[i][0] == 0) dp[i][0] = 1;
            else break;
        }
        for (int i = 0; i < m ; i++) {
            if (obstacleGrid[0][i] == 0) dp[0][i] = 1;
            else break;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i ][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else dp[i][j] = 0;
            }
        }
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < m ; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        return dp[n-1][m-1];
    }


}
