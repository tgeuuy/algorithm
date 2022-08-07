package leetcode.leet_1;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                res[0] = i;
                res[1] = map.get(value);

            } else {
                map.put(nums[i], i);
            }
        }

        return res;
    }

    @Test
    public void practice() {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(array, target);
        for (int n : res) {
            System.out.print(n + " ");
        }

    }
}
