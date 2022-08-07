package leetcode.leet_16;

import org.junit.Test;

public class Solution {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length]; //dp[i]是以i结尾的最大子数列的和
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
            max = Math.max(dp[i], max);
            System.out.println("dp["+i+"]"+"="+dp[i]);
        }
        return max;

    }


    @Test
    public void practice() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArray(array);
        System.out.println(res);
    }
}
