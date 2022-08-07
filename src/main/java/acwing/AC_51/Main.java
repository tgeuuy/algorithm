package acwing.AC_51;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tgeuuy
 * @Date 2021/12/9 10:57
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> res = permutation(nums);
        for(List<Integer> list:res){
            System.out.println(list.toString());
        }
//        System.out.println(res.toString());
    }


    public static List<List<Integer>> permutation(int[] nums) {
        boolean[] st = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        dfs(res, new ArrayList<Integer>(), st, nums);
        return res;

    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> path, boolean[] st, int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (st[i] || i > 0 && nums[i - 1] == nums[i] && !st[i - 1]) continue;
            path.add(nums[i]);
            st[i] = true;
            dfs(res, path, st, nums);
            path.remove(path.size() - 1);
            st[i] = false;
        }
    }


}
