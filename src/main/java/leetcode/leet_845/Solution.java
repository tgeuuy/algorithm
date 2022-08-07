package leetcode.leet_845;

import org.junit.Test;


public class Solution {


    public int longestMountain(int[] A) {
        int res = 0;
        int start = -1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                if (i == 1 || A[i - 2] >= A[i - 1]) {
                    start = i - 1;
                }
            } else if (A[i] > A[i + 1]) {
                if (start != -1) {
                    res = Math.max(res, i - start + 1);
                }

            } else {
                start = -1;
            }
        }

        return res;
    }

    @Test
    public void practice() {
        int[] array = {2, 1, 4, 7, 3, 2, 5};
        int res = longestMountain(array);
        System.out.println("res=" + res);
    }
}
