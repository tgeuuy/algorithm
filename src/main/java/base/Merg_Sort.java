package base;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 10:31
 * @Version 1.0
 */
public class Merg_Sort {
    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        merg_sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    private static void merg_sort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = (r + l) >> 1;
        int[] tmp = new int[nums.length];
        merg_sort(nums, l, mid);
        merg_sort(nums, mid + 1, r);
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (nums[i] < nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }
        while (i <= mid) tmp[k++] = nums[i++];
        while (j <= r) tmp[k++] = nums[j++];
        for (int p = 0, q = l; q <= r; q++, p++) nums[q] = tmp[p];
    }
}
