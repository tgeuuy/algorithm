package acwing.AC_67;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 16:57
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 9, 9, 10};
        int res = getNumberOfK(nums, 4);
        System.out.println("res=" + res);
    }

    private static int getNumberOfK(int[] nums, int k) {
//        int l = 0, r = nums.length - 1;
//        int mid = 0;
//        int res = 0;
//        while (l < r) {
//            mid = (l + r) >> 1;
//            if (nums[mid] > k) r = mid;
//            else l = mid + 1;
//            if (nums[mid] == k) break;
//        }
//        int i = mid, j = mid;
//        while (i < nums.length && nums[i] == k) {
//            res++;
//            i++;
//        }
//        while (j - 1 >= 0 && nums[j - 1] == k) {
//            res++;
//            j--;
//        }
//        return res;

        if (nums == null || nums.length == 0) return 0;

        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= k) r = mid;
            else l = mid + 1;
        }
        if (nums[r] != k)   return 0;;
        int ri = r;
        l = 0;
        r = nums.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= k) l = mid;
            else r = mid - 1;
        }
        return ri - l + 1;

    }

}



