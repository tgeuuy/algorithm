package leetcode.leet_27;

import java.util.Arrays;

public class Solution {

    public static int removeElement(int[] nums, int val) {
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l ;

    }


    private static void sort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);
        int i = l, j = mid + 1, k = 0;
        int[] tmp = new int[nums.length];
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }
        while (i <= mid) tmp[k++] = nums[i++];
        while (j <= r) tmp[k++] = nums[j++];
        for (int p = l, q = 0; p <= r; p++, q++) nums[p] = tmp[q];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 43, 534, 6, 7, 7, 7, 7, 8, 4, 5, 6};
        int res = removeElement(arr, 7);
        System.out.println("res= " + res);

    }
}
