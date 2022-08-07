package acwing.AC_86;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/23 16:48
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = multiply(nums);
        System.out.println(Arrays.toString(res));
    }


    public static int[] multiply(int[] A) {
        if (A.length == 0) return null;
        int[] res = new int[A.length];
        int p = A[0];
        res[0] = 1;
        for (int i = 1; i < A.length; i++) {
            res[i] = p;
            p *= A[i];

        }
        System.out.println(Arrays.toString(res));
        p = A[A.length - 1];

        for (int i = A.length - 2; i >= 0; --i) {
            res[i] *= p;
            p *= A[i];
        }
        return res;

    }
}
