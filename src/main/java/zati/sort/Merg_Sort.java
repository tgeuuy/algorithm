package zati.sort;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 21:09
 * @Version 1.0
 */
public class Merg_Sort {
    public static void main(String[] args) {
        int[] arr = {123, 4, 3245, 32, 534536, 5467567, 3,222222223, 5, 67, 78, 567254, 3, 5, 6, 8, 3, 4, 6, 8};
        merg_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void merg_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) >> 1;
        merg_sort(arr, l, mid);
        merg_sort(arr, mid + 1, r);
        int i = l, j = mid + 1, k = 0;
        int[] tmp = new int[arr.length];
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= r) tmp[k++] = arr[j++];

        for (int p = l, q = 0; p <= r; p++, q++) arr[p] = tmp[q];
    }
}
