package leetcode.leet_55;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 22:09
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        boolean res = canJump(nums);
        System.out.println("res=" + res);


    }


    public static boolean canJump(int[] nums) {
        int farmost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= farmost) farmost = Math.max(farmost, i + nums[i]);
            if (farmost >= nums.length - 1) return true;
        }
        return false;
    }
}
