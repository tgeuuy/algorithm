package leetcode.leet_69;

import org.junit.Test;

public class Solution {
    public int mySqrt(int x) {

        long r, l;
        r = Integer.MAX_VALUE;
        System.out.println("r=" + r);
        l = 0;
        while (r - l > 0) {
            long mid = (l + r + 1) / 2;
            System.out.println("mid=" + mid);
            if (mid * mid > x) r = mid - 1;
            else l = mid;
        }
        return (int)l;

    }

    @Test
    public void practice() {
        int n = 8;
        int res = mySqrt(n);
        System.out.println("res=" + res);
    }


}
