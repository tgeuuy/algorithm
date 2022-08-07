package zati.sort;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Heap_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        heap_sort(arr);
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    public static void heap_sort(int[] arr) {
        int n = arr.length;

        for (int i = (n - 1) / 2; i >= 0; i--) heap(arr, i, n);

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i] ^ arr[0];
            arr[0] = arr[i] ^ arr[0];
            arr[i] = arr[i] ^ arr[0];
            heap(arr, 0, i);
        }
    }

    private static void heap(int[] arr, int index, int length) {
        int left = index * 2 + 1;
        while (left < length) {
            int tmp = arr[index];
            int right = left + 1;
            if (right < length && arr[left] < arr[right]) left++;
            if (tmp > arr[left]) break;
            arr[index] = arr[left];
            arr[left] = tmp;
            index = left;
            left = left * 2 + 1;

        }

    }
}
