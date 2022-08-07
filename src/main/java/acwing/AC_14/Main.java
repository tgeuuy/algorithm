package acwing.AC_14;

/**
 * @Author tgeuuy
 * @Date 2021/11/14 11:32
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 7, 5, 9, 7, 9, 5, 1, 5, 6, 7};
        System.out.println(duplicateInArray(nums));

    }

    public static int duplicateInArray(int[] nums) {
        int l = 1, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            int s = 0;
            for (int x : nums) {

                s += (x >= 1 && x <= mid) ? 1 : 0;
            }
            if (s > mid - l + 1) r = mid;
            else l = mid + 1;
        }
        return r;
    }


}
