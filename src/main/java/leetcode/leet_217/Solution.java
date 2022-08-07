package leetcode.leet_217;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if ( !set.add(nums[i]))
                return false;
        }
        return true;
//        if (set.size() == nums.length) return false;
//        return true;
    }

    @Test
    public void practice() {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 6};
        boolean res = containsDuplicate(nums);
        System.out.println("res=" + res);
    }
}
