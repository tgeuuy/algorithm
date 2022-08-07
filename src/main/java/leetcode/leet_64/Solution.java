package leetcode.leet_64;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int res = minPathSum(arr);
        System.out.println("res=" + res);

    }

    public static int minPathSum(int[][] arr) {


        int n = arr.length;
        int m = arr[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] dp = new int[n][m];
        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) dp[i][0] = arr[i][0] + dp[i - 1][0];
        for (int i = 1; i < m; i++) dp[0][i] = arr[0][i] + dp[0][i - 1];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n - 1][m - 1];


    }
}
