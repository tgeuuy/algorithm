package leetcode.leet_96;

import org.junit.Test;

public class Solution {


    public int[][] nums;

    @Test
    public void practice() {


        int res = numTrees(18);
        System.out.println("res=" + res);

    }


  /*  public int numTrees(int n) {
        return count(1, n);

    }

    private int count(int l, int r) {
        if (l > r) return 1;
        int res = 0;
        for (int i = l; i <= r; i++) {
            int left = count(l, i - 1);
            int right = count(i + 1, r);
            res += left * right;
        }
        return res;
    }*/

    public int numTrees(int n) {
        nums = new int[n + 1][n + 1];
        return count(1, n);
    }

    private int count(int l, int r) {
        if (l > r) return 1;
        if (nums[l][r] != 0) return nums[l][r];
        int res = 0;
        for (int i = l; i <= r; i++) {
            int left = count(l, i - 1);
            int right = count(i + 1, r);
            res += left * right;
        }
        nums[l][r] = res;
        return res;
    }
}
