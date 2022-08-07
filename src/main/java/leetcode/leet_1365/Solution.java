package leetcode.leet_1365;

import org.junit.Test;

public class Solution {

    public void quicksort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) >> 1;
        int q = nums[mid];
        int i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < q);
            do j--; while (nums[j] > q);
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;

            }
        }
        quicksort(nums, l, j);
        quicksort(nums, j + 1, r);

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        //quicksort(nums, 0, nums.length - 1);
        int[] res = new int[nums.length];


        for (int i = 0; i < nums.length; ++i) {
            res[i] = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    res[i]++;
                }
            }

        }
        return res;
    }


    @Test
    public void practice() {
        int[] array = {8, 1, 2, 2, 3};


        int[] res = smallerNumbersThanCurrent(array);
        for (int i = 0; i < res.length; ++i) {
            System.out.print(res[i] + " ");

        }

    }
}
