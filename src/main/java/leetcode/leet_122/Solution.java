package leetcode.leet_122;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int res = maxProfit(arr);
        System.out.println("res=" + res);

    }


    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            if (i - 1 == -1) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[n - 1][0];

    }
}
