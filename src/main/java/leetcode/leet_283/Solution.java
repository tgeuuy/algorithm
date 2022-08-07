package leetcode.leet_283;

import org.junit.Test;

public class Solution {

    //    public void moveZeroes(int[] nums) {
//        int i = -1, j = nums.length;
//        while (i < j) {
//            do i++; while (nums[i] != 0);
//            do j--; while (nums[j] == 0);
//            if (i < j) {
//                nums[i] = nums[i] + nums[j];
//
//                nums[j] = nums[i] - nums[j];
//
//                nums[i] = nums[i] - nums[j];
//            }
//        }
//
//    }

    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (x != 0)
                nums[k++] = x;

        }
        while (k < nums.length) nums[k++] = 0;



    }

    @Test
    public void practice() {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        return;
    }
}
