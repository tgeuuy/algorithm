package jzoffer.jz_42;

import org.junit.Test;

public class Solution {


    @Test
    public void test() {
        System.out.println("res=" + maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) sum = nums[i];
            else sum += nums[i];
            res = Math.max(res, sum);
        }
        return res;

    }
}
