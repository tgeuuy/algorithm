package leetcode.leet_167;

import java.util.Arrays;
import java.util.Enumeration;

public class Solution {
    public static int[] twoSum(int[] arr, int tar) {
        int l = 0, r = arr.length - 1;
        while (l < r && r >= 0 && l < arr.length) {
            if (arr[l] + arr[r] == tar) return new int[]{l + 1, r + 1};
            if (arr[l] + arr[r] > tar) r--;
            else l++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] res = twoSum(arr, 9);
        System.out.println(Arrays.toString(res));


    }
}
