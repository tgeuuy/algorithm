package acwing.AC_73;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/18 10:32
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5};
        int[] res = findNumsAppearOnce(nums);
        System.out.println(Arrays.toString(res));
    }


    public static int[] findNumsAppearOnce(int[] nums) {

        if (nums.length < 2) return null;
        int xy = 0;
        for (int v : nums) xy ^= v;
        int k = 0;
        while (((xy >> k) & 1) == 0) k++;
        int x = 0;
        for (int v : nums) {
            if (((v >> k) & 1) == 1) x ^= v;
        }
        int y = xy ^ x;
        return new int[]{x, y};


    }
}
