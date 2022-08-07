package leetcode.leet_162;

/**
 * @Author tgeuuy
 * @Date 2021/10/29 9:45
 * @Version 1.0
 */
public class Solution {


    public static void main(String[] args) {


        int[] arr = {1, 2, 5, 9, 4, 6, 7, 4};
        int res = findPeakElement(arr);
        System.out.println("res=" + res);
    }


    public static int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] > nums[mid + 1]) r = mid;
            else l = mid + 1;
        }
        return r;

    }
}
