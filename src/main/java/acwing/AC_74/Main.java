package acwing.AC_74;

/**
 * @Author tgeuuy
 * @Date 2021/12/18 11:21
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 4, 4, 4};
        int res = findNumberAppearingOnce(nums);
        System.out.println("res= " + res);

    }

    public static int findNumberAppearingOnce(int[] nums) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            int c = 0;
            for (int v : nums) {
                if (((v >> i) & 1) == 1) c++;

            }
            if (c % 3 == 1) res += (1 << i);
        }
        return res;
    }

}
