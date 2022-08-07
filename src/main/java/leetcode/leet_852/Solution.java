package leetcode.leet_852;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        System.out.println(peakIndexInMountainArray(new int[]{0, 0, 2, 1, 0}));
    }

//    public int peakIndexInMountainArray(int[] arr) {
//        int i = 0, res = 1, j = arr.length - 1;
//            while (arr[i] < arr[res]) {
//                i++;
//                res++;
//            }
//            while (arr[j] > arr[res - 1]) {
//                j--;
//            }
//
//        return res - 1;
//    }


    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1, right = n - 2, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
