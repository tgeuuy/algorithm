package leetcode.leet_300;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int res = lengthOfLIS(arr);
        System.out.println("res=" + res);

    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[j] + 1, dp[j]);
            }

        }
        int res = -1;
        for (int v : dp) {
            res = Math.max(res, v);
        }
        return res;

    }
}
