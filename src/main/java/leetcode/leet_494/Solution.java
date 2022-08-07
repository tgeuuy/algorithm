package leetcode.leet_494;

import org.junit.Test;

public class Solution {
    public boolean[] mark;
    public int[] array;
    public int len;
    public int res = 0;
    public int tar;

    @Test
    public void test() {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1}, 1));
    }

    public int findTargetSumWays(int[] nums, int target) {
        this.len = nums.length;
        this.array = new int[len];
        System.arraycopy(nums, 0, array, 0, len);
        this.mark = new boolean[len];
        this.tar = target;
//        for (int i=0;i<len;i++){
//            mark[i]=false;
//            System.out.println(mark[i]+" "+array[i]);
//        }
//        System.out.println(len+" "+target);
        dfs(array, 0);
        return res;

    }

    private void dfs(int[] array, int index) {

        if (index == len ) {
            int sum = 0;
            for (int v : array) sum += v;
            if (sum == tar) {
                for (int v : array) System.out.print(v + " ");
                System.out.println("index=" + index);
                res++;
            }
            return;
        }
            if (!mark[index]) {
                mark[index] = true;
                index++;
                dfs(array, index);
                index--;
                mark[index] = false;


                mark[index] = true;
                array[index] = array[index] * (-1);
                index++;
                dfs(array, index);
                index--;
                mark[index] = false;
            }

    }
}
