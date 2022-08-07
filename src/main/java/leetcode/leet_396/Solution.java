package leetcode.leet_396;

import java.util.Arrays;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int res = maxRotateFunction(arr);
        System.out.println("res = " + res);
    }

    public static int maxRotateFunction(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int f0 = 0;
        for (int i = 0; i < nums.length; i++) {
            f0 += nums[i] * i;
        }
        int res = f0;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            f0 += sum - (n) * nums[i];
            res = Math.max(res, f0);
        }
        return res;
    }


}
