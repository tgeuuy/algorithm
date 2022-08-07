package jzoffer.jz_4;

import org.junit.Test;

public class Solution {


    @Test
    public void test() {
        System.out.println("res=" + searchArray(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}}, 7));
    }

    public boolean searchArray(int[][] array, int target) {
        if (array == null || array[0] == null) return false;
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] > target) j--;
            else i++;
            if (array[i][j] == target) return true;
        }
        return false;
    }
}
