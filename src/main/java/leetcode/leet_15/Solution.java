package leetcode.leet_15;

import java.util.*;

public class Solution {

    static List<List<Integer>> res = new ArrayList<>();
    static Deque<Integer> path = new LinkedList<>();
    static boolean[] st;


    public static List<List<Integer>> threeSum(int[] nums) {


        if (nums.length <= 2 || nums == null) return res;

        Arrays.sort(nums);
        st = new boolean[nums.length];
        dfs(nums, 0, 0);

        return res;


    }

    private static void dfs(int[] nums, int sum, int p) {
        if (path.size() == 3 && sum == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = p; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !st[i] && !st[i - 1]) continue;
            if (!st[i]) {
                path.addLast(nums[i]);
                st[i] = true;
                dfs(nums, sum - nums[i], i + 1);
                path.removeLast();
                st[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(arr);
        for (List list : res) {
            System.out.println(list.toString());
        }

    }
}
