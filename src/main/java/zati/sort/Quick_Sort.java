package zati.sort;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 20:58
 * @Version 1.0
 */
public class Quick_Sort {


    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 9, 5, 3, 45, 67, 7, 4363, 67, 1, 22222, 424};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int mid = (l + r) >> 1;
        while (i < j) {
            do i++; while (arr[mid] > arr[i]);
            do j--; while (arr[mid] < arr[j]);
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        quick_sort(arr, l, j);
        quick_sort(arr, j + 1, r);
    }
}
