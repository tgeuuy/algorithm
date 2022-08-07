package acwing.AC_786;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/24 18:08
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        quick_sort(arr, 0, n - 1);
        System.out.println(arr[k - 1]);
    }

    private static void quick_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = arr[(l + r) >> 1];
        int i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (arr[i] < mid);
            do j--; while (arr[j] > mid);
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
