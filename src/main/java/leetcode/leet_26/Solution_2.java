package leetcode.leet_26;

import java.util.Arrays;

public class Solution_2 {


    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = (n - 1) / 2; i >= 0; i--) heap(arr, i, n);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void heap(int[] arr, int index, int length) {
//        System.out.println(arr[index]);
        int left = 2 * index + 1;
        while (left < length) {
            int tmp = arr[index];
            int right = left + 1;
            if (right < length && arr[left] < arr[right]) left++;
            if (arr[left] < tmp) break;
            arr[index] = arr[left];
            arr[left] = tmp;
            index = left;
            left = left * 2 + 1;

        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[j] ^ arr[i];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[j] ^ arr[i];
    }


    public static int removeDuplicates(int[] arr) {
        int l = 0, r = 0;
        while (r < arr.length) {
            if (arr[r] != arr[l]) {
                l++;
                arr[l] = arr[r];
            }
            r++;
        }
        return l + 1;

    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 3, 2, 5, 5, 5, 6, 6, 7, 8, 9, 1, 4, 4, 5, 6, 7};
        sort(arr);
        int res = removeDuplicates(arr);
        System.out.println("res=" + res);

    }
}
