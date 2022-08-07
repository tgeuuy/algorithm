package zati.test;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 4, 37, 4, 67, 67, 100};
        Set<Integer> set = new HashSet<>();
        for (int v : arr) {
            set.add(v);
        }
        int[] newArr = new int[set.size() * 2];
        int p = 0;
        for (int v : set) {
            newArr[p ] = v;
            newArr[p  + 1] = v;
            p  += 2;
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int ln = arr.length;
        if (ln < 4) {
            System.out.println(Arrays.toString(arr));
        } else {
            int[] arrr = new int[4];
            int lln = arr.length;
            for (int i = lln - 4, j = 0; i < lln; i++, j++) {
                arrr[j] = arr[i];
            }
            System.out.println(Arrays.toString(arrr));
        }

        Arrays.sort(arr);
        int tar = 67;
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + r >> 1;

            if (arr[mid] < tar) l = mid + 1;
            else r = mid;
        }
        System.out.println(l);
    }
}
