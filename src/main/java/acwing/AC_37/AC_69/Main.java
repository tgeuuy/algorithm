package acwing.AC_37.AC_69;

/**
 * @Author tgeuuy
 * @Date 2021/12/19 14:34
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {-3, -1, 1, 3, 5};
        int res = getNumberSameAsIndex(nums);
        System.out.println("res = " + res);
    }


    public static int getNumberSameAsIndex(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] - mid >= 0) r = mid;
            else l = mid + 1;
        }
        if (nums[r] != r) r = -1;
        return r;

    }
}
