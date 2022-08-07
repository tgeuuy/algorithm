package leetcode.leet_15;

import java.util.*;

public class Solution1 {


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length <= 2 || nums == null) return res;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int one = 0; one < nums.length; one++) {
            if (one > 0 && nums[one] == nums[one - 1]) continue;
            int two = one + 1;
            int three = nums.length - 1;
            int tar = 0 - nums[one];
            for (; two < nums.length; two++) {
                if (two > one + 1 && nums[two] == nums[two - 1]) continue;
                while (two < three && nums[two] + nums[three] > tar) three--;
                if (nums[two] == nums[three]) break;
                if (nums[three] + nums[two] == tar) {
                    List<Integer> path = new ArrayList<>();
                    path.add(nums[one]);
                    path.add(nums[two]);
                    path.add(nums[three]);
                    res.add(path);
                }
            }
        }
        return res;

    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> res = threeSum(arr);
        for (List list : res) {
            System.out.println(list.toString());
        }


    }
}
