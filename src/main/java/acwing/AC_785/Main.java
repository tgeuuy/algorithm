package acwing.AC_785;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 49, 59, 37, 88, 31, 54, 68, 97, 98};
        quick_sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quick_sort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) >> 1;
        int i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < nums[mid]);
            do j--; while (nums[j] > nums[mid]);
            if (i < j) {
                nums[i] = nums[j] ^ nums[i];
                nums[j] = nums[j] ^ nums[i];
                nums[i] = nums[j] ^ nums[i];
            }
        }
        quick_sort(nums, l, j);
        quick_sort(nums, j + 1, r);

    }
}
