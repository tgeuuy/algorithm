package leetcode.leet_560;

import org.junit.Test;

import java.util.HashMap;

public class Solution {


    @Test
    public void practice() {
        int[] nums = {1,1,1};
        int res = subarraySum(nums, 2);
        System.out.println("res=" + res);
    }

    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int res = 0;
        preSum.put(0, 1);
        int sum0_i = 0;
        for (int i = 0; i < n; i++) {
            sum0_i += nums[i]; //0到i的数字和
            int sum0_j = sum0_i - k;//0到j的数字和得为sum0_i-k才复合条件
            if (preSum.containsKey(sum0_j)) {
                res += preSum.get(sum0_j);
            }
            preSum.put(sum0_i, preSum.getOrDefault(0,sum0_i )+1);
        }
        return res;
    }
}
