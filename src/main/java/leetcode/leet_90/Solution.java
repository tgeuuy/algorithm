package leetcode.leet_90;

import java.util.*;

public class Solution {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> lev = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> res = subsets(arr);

        for (List list : res) {
            System.out.print(list.toString() + " ");
        }

    }


    public static List<List<Integer>> subsets(int[] nums) {
        boolean[] st = new boolean[nums.length];
        dfs(nums, 0, st);

        return res;
    }

    public static void dfs(int[] nums, int p, boolean[] st) {
        if (p == nums.length) {
            lev = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    return;
                } else if(st[i]) {
                    lev.add(nums[i]);
                    
                }else {
                    continue;
                }
            }
            res.add(lev);
            return;
        }
        st[p] = true;
        dfs(nums, p + 1, st);
        st[p] = false;
        dfs(nums, p + 1, st);
    }
}
