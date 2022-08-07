package leetcode.leet_128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};
        int res = longestConsecutive(arr);
        System.out.println("res=" + res);

    }

    public static int longestConsecutive(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int le = 0;
        for (; le < nums.length - 1; le++) {
            if (le > 0 && nums[le] == nums[le - 1]) nums[le] = nums[le + 1];
        }
        for (int i = 0; i < le; i++) System.out.print(nums[i] + " ");
        for (int i = 0; i < nums.length; i++) {
            int l = 1;
            while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                l++;
                i++;
            }
            res = Math.max(res, l);
        }
        return res;
    }
}
