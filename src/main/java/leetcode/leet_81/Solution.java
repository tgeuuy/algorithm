package leetcode.leet_81;

public class Solution {


    public static void main(String[] args) {
        int[] nums = {2};
        int target = 3;
        boolean res = search(nums, target);
        System.out.println("res=" + res);
    }

    private static boolean search(int[] nums, int target) {

        int l = -1, r = nums.length;
        while (l < r) {
            do {
                l++;
                //System.out.println("l=" + nums[l]);
            } while (nums[l] < target && l < nums.length - 1);
            if (nums[l] == target) return true;
            do {
                r--;
                //System.out.println("r=" + nums[r]);
            } while (nums[r] > target && r > 0);
            if (nums[r] == target) return true;
            if (nums[l] > target && nums[r] < target) break;

        }
        return false;
    }
}
