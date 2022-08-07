package leetcode.leet_322;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int res = coinChange(coins, amount);
        System.out.println("res=" + res);

    }

    private static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int v : coins) {
                if (i - v < 0) continue;
                else {
                    dp[i] = Math.min(dp[i - v] + 1, dp[i]);

                }
            }

        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];

    }
}
