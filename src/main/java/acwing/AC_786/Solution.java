package acwing.AC_786;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_786
 * @Author: tgeuuy
 * @CreateTime: 2022-06-24  22:10
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();
        int res = findTheM(arr, 1, n , m);
        System.out.println("res = " + res);


    }

    private static int findTheM(int[] arr, int l, int r, int m) {
        if (l >= r) return arr[l];
        else {
            int i = l - 1, j = r + 1;
            int mid = arr[l + r >> 1];
            while (i < j) {
                do i++; while (arr[i] < mid);
                do j--; while (arr[j] > mid);
                if (i < j) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            if (j - l + 1 >= m) return findTheM(arr, l, j, m);
            else return findTheM(arr, j + 1, r, m - (j - l + 1));
        }

    }
}
