package acwing.AC_79;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/11/14 10:20
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 2, 6, 2, 5, 1};
        int k = 4;
        int[] res = maxInWindows(nums, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] maxInWindows(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        if (k == 0) return res;
        int start;
        int index = 0;
        ArrayDeque<Integer> max = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            start = i - k + 1;
            if (max.isEmpty()) {
                max.add(i);
            } else if (start > max.peekFirst()) {
                max.pollFirst();
            }

            while ((!max.isEmpty()) && nums[max.peekLast()] <= nums[i]) {
                max.pollLast();
            }
            max.add(i);
            if (start >= 0) {
                res[index++] = nums[max.peekFirst()];
            }
        }
        return res;
    }
}
