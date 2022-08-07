package leetcode.leet_70;

import org.junit.Test;

public class Solution {
    @Test
    public void test()
    {
        System.out.println("res="+climbStairs(10));
    }

    private int climbStairs(int n) {
        int res=1,a=0,b=0;
        for (int i=1;i<=n;i++){
            a=b;
            b=res;
            res=a+b;
        }
        return res;
    }
}
