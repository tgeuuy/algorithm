package leetcode.leet_215;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int res = findKthLargest(arr, k);
        System.out.println("res=" + res);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int findKthLargest(int[] nums, int k) {
        int res = find_k(nums, 0, nums.length - 1, nums.length - k + 1);
        return res;

    }

    private static int find_k(int[] arr, int l, int r, int k) {
        if (l >= r) return arr[l];
        int i = l - 1, j = r + 1;
        int mid = l + r >> 1;
        while (i < j) {
            do i++; while (arr[i] > arr[mid]);
            do j--; while (arr[j] < arr[mid]);
            if (i < j) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        if (j - l + 1 >= k) return find_k(arr, l, j, k);
        else return find_k(arr, j + 1, r, k - (j - l + 1));

    }
}
