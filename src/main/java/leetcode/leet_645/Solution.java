package leetcode.leet_645;

import org.junit.Test;

public class Solution {

    @Test
    public void test() {
        int[] res = findErrorNums(new int[]{2, 2});
        for (int v : res) {
            System.out.print(v + " ");
        }
    }


    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int len = nums.length;
        int[] c = new int[len + 1];
        for (int num : nums) {
            c[num]++;
        }
        for (int i = 1; i < len + 1; i++) {
            if (c[i] == 2) res[0]=i;

            if (c[i] == 0) res[1]=i;
        }
        return res;
    }
}
