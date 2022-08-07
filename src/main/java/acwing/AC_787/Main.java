package acwing.AC_787;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_787
 * @Author: tgeuuy
 * @CreateTime: 2022-06-24  22:57
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 100005;
    public static int[] arr = new int[MAXSIZE];
    public static int[] tmp = new int[MAXSIZE];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        merg_sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void merg_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        merg_sort(arr, l, mid);
        merg_sort(arr, mid + 1, r);
        int i = l, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= r) tmp[k++] = arr[j++];
        for (int p = l, q = 0; p <= r; p++, q++) arr[p] = tmp[q];

    }
}
