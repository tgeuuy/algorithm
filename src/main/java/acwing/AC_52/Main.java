package acwing.AC_52;

/**
 * @Author tgeuuy
 * @Date 2021/12/9 10:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        int res = moreThanHalfNum_Solution(nums);
        System.out.println("res=" + res);
    }

    private static int moreThanHalfNum_Solution(int[] nums) {
        int res = nums[0], c = 1;
        for (int v : nums) {
            if (v == res) c++;
            else c--;
            if (c == 0) {
                res = v;
                c = 1;
            }
        }
        return res;
    }
}
