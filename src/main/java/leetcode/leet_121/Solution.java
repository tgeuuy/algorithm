package leetcode.leet_121;

public class Solution {


    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int res = maxProfit(arr);
        System.out.println("res=" + res);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i - 1 == -1) {
                dp[i][0] = 0;
                dp[i][1] = -prices[0];
                continue;
            }
            //我今天如果没有吃股票，那我今天的利润等于昨天的利润（没有持有股票） 和 昨天的利润（持有股票）加上今天的股票
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(dp[i][0]+" "+dp[i][1]);
        }
        return dp[n - 1][0];
    }
}
