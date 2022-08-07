package leetcode.leet_868;

public class Solution {
    public static void main(String[] args) {
        int n = 8; // 10110
        int res = binaryGap(n);
        System.out.println("res = " + res);
    }

    public static int binaryGap(int n) {
        int res = -1;
        int c = 0;
        int cur = 0, next = 0;

        for (int i = 31; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                System.out.println(i);
                if (c == 0) {
                    cur = i;
                    c++;
                    continue;
                } else {
                    next = i;
                    System.out.println(next + "  " + cur);
                    res = Math.max(res, cur - next);
                    cur = i;
                    c++;
                }

            }


        }
        return c == 1 ? 0 : res ;

    }


}


