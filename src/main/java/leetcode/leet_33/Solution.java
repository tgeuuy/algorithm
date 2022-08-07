package leetcode.leet_33;

import java.util.HashMap;

/**
 * @Author tgeuuy
 * @Date 2021/12/30 10:34
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int res = search(nums, 6);
        System.out.println("res=" + res);

    }

    public static int search(int[] arr, int target) {
        int len = arr.length;
        if (len == 0 || arr == null) return -1;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + r >> 1;
            if (arr[mid] == target) return mid;
            if (arr[0] <= arr[mid]) {
                if (arr[0] <= target && target < arr[mid]) r = mid - 1;
                else l = mid + 1;
            } else {
                if (arr[mid] < target && target <= arr[len - 1]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;


    }
}
