package leetcode.leet_34;

import org.junit.Test;

public class Solution_34 {


    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int l = 0, r = nums.length - 1;
        int L, R;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        if (nums[r] != target) return new int[]{-1, -1};
        L = l;

        int l1 = 0, r1 = nums.length - 1;
        while (l1 < r1) {
            int mid = (l1 + r1 + 1) >> 1;
            if (nums[mid] <= target) l1 = mid;
            else r1 = mid - 1;
        }
        R = r1;

        return new int[]{L, R};
    }

    @Test
    public void practice() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] res = searchRange(nums, 8);
        System.out.println(res[0] + "," + res[1]);
        return;
    }
}
