package acwing.AC_788;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_788
 * @Author: tgeuuy
 * @CreateTime: 2022-06-24  23:14
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
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = niXuNum(arr, 1, n);
        System.out.println(res);
    }

    private static long niXuNum(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int mid = l + r >> 1;
        long res = niXuNum(arr, l, mid) + niXuNum(arr, mid + 1, r);
        int i = l, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) tmp[k++] = arr[i++];
            else {
                res += mid - i + 1;
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= r) tmp[k++] = arr[j++];
        for (int p = 0, q = l; q <= r; q++, p++) arr[q] = tmp[p];
        return res;
    }
}
