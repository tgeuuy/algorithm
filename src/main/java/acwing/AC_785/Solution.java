package acwing.AC_785;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_785
 * @Author: tgeuuy
 * @CreateTime: 2022-06-23  15:11
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        quick_sort(arr, 0, n - 1);

        for (int v : arr) System.out.print(v + " ");
    }

    public static void quick_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;

        int mid = arr[l + r >> 1];

        while (i < j) {
            do i++; while (mid > arr[i]);
            do j--; while (mid < arr[j]);
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        quick_sort(arr, l, j);
        quick_sort(arr, j + 1, r);

    }
}
