package leetcode.leet_7;

import org.junit.Test;

public class Solution {
    public int reverse(int x) {
        final int intmax = Integer.MAX_VALUE;
        final int intmin = Integer.MIN_VALUE;
        if (x > intmax || x < intmin) return 0;
        int res = 0;
        if (x == 0) res = 0;
        while (x != 0) {
            int tmp = x % 10;
            x = x / 10;
            if (res > intmax / 10 || (res == intmax / 10 && tmp > 7)) return 0;
            if (res < intmin / 10 || (res == intmin / 10 && tmp < -8)) return 0;
            res = res * 10 + tmp;
        }
        return res;
    }

    @Test
    public void solution() {
        int n = -2147483412;
        int res = reverse(n);
        System.out.println("res=" + res);
    }
}
