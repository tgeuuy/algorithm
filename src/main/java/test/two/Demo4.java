package test.two;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {



        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6};
        int n = arr.length;
        int l = 0, r = 0;
        while (r < arr.length) {
            if (arr[l] != arr[r]) {
                l++;
                arr[l] = arr[r];

            }
            r++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
