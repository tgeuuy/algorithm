package acwing.AC_13;

/**
 * @Author tgeuuy
 * @Date 2021/11/14 11:21
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(duplicateInArray(nums));

    }

    public static int duplicateInArray(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 || nums[i] > len - 1) return -1;
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) return i;
        }
        return -1;


    }
}
