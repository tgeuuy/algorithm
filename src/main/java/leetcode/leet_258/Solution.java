package leetcode.leet_258;

import org.junit.Test;

public class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int res = 0;
        while (num != 0) {
            int tmp = num % 10;
            res += tmp;
            num /= 10;

        }
        return addDigits(res);
    }

    @Test
    public void practice() {
        int n = 119;
        int res = addDigits(n);
        System.out.println(res);
    }
}
