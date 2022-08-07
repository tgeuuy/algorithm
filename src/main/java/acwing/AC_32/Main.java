package acwing.AC_32;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/11/23 10:17
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //{1, 3, 5, 7, 9, 2, 4, 6, 8};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reOrderArray(int[] array) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            while (l < r && array[l] % 2 == 1) l++;
            while (l < r && array[r] % 2 == 0) r--;
            if (l < r) {
                array[l] = array[l] ^ array[r];
                array[r] = array[l] ^ array[r];
                array[l] = array[l] ^ array[r];
            }
        }

    }
}
