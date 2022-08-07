package leetcode.leet_274;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    @Test
    public void test() {
        System.out.println("res=" + hIndex(new int[]{1,3,1}));
    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}