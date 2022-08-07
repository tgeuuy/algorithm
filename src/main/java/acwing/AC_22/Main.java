package acwing.AC_22;

/**
 * @Author tgeuuy
 * @Date 2021/11/19 9:33
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        int res = findMin(nums);
        System.out.println(res);
    }

    private static int findMin(int[] nums) {
        int n = nums.length - 1;
        if (n < 0) return -1;
        while (n > 0 && nums[n] == nums[0]) n--;
        if (nums[n] > nums[0]) return nums[0];
        int l = 0, r = n;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] < nums[0]) r = mid;
            else l = mid + 1;
        }
        return nums[r];
    }}
