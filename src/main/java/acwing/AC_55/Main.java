package acwing.AC_55;

/**
 * @Author tgeuuy
 * @Date 2021/12/3 10:00
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
        int res = maxSubArray(nums);
        System.out.println("res=" + res);

    }


    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int res = Integer.MIN_VALUE;
        int s = 0; //以前一个结尾的子数组的最大和是多少。
        for (int v : nums) {
            if (s < 0) s = 0;
            s += v;
            res = Math.max(res, s);

        }
        return res;
    }
}
