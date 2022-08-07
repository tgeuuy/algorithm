package leetcode.leet_275;

import org.junit.Test;

public class Solution {


    @Test
    public void test() {
        System.out.println("res=" + hIndex(new int[]{0, 1, 3, 5, 6}));
    }


    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) right = mid - 1;
            else left = mid + 1;
        }
        return n - left;
    }
}
