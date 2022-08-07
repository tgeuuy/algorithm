package leetcode.leet_53;

import org.junit.Test;

/**
 * 最大子序和
 */

public class Solution {
    @Test
    public void test(){
        System.out.println("res="+maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    private int maxSubArray(int[] ints) {
        int res=ints[0];
        int pre=0;
        for(int v: ints){
            pre=Math.max(pre+v,v);
            System.out.println("pre="+pre);
            res=Math.max(res,pre);
            System.out.println("res="+res+System.lineSeparator());
        }
        return res;
    }
}
