package acwing.AC_83;

/**
 * @Author tgeuuy
 * @Date 2021/12/24 10:47
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {9, 11, 8, 5, 7, 12, 16, 14};
        int res = maxDiff1(nums);
        System.out.println("res=" + res);
    }

    public static int maxDiff(int[] nums) {
        if (nums.length <= 1) return 0;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int min = get_min(nums, 0, i - 1);
            System.out.println(min);
            res = Math.max(res, nums[i] - min);
        }
        return Math.max(res, 0);


    }

    private static int get_min(int[] nums, int l, int r) {
        if (l == r) return nums[l];
        int min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }


    public static int maxDiff1(int[] nums) {
        if (nums.length <= 1) return 0;
        int res = Integer.MIN_VALUE;
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(nums[i], min);
            System.out.println(min);
            res = Math.max(res, nums[i + 1] - min);
        }
        return Math.max(res, 0);


    }


}
