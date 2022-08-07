package leetcode.leet_11;

import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res = maxArea(arr);
        System.out.println("res=" + res);
        System.out.println(String.valueOf(524));
        StringBuilder sb = new StringBuilder("dasdasda");

    }

    public static int maxArea(int[] arr) {
        int res = 0;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (arr[l] < arr[r]) {
                res = Math.max(arr[l] * (r - l), res);
                l++;
            } else {
                res = Math.max(arr[r] * (r - l), res);
                r--;
            }
        }
        return res;

    }
}
