package leetcode.leet_941;

import org.junit.Test;

public class Solution {


    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;

        int i = 0, j = A.length - 1, index = 1;
        for (int q = 1; q < A.length-1; q++) {

            while (A[i] < A[q] && i < j) {
                i++;
                index++;
                System.out.println("左index=" + index);
            }
            while (A[j] < A[q] && i < j) {
                j--;
                index++;
                System.out.println("右index=" + index);
            }


            System.out.println("index=" + index);
            if (index == A.length) return true;
            else {
                index = 1;
                i = 0;
                j = A.length - 1;
            }
        }

        return false;

    }

    @Test
    public void practice() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean res = validMountainArray(nums);
        System.out.println("res=" + res);
    }
}
