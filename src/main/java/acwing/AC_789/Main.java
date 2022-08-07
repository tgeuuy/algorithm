package acwing.AC_789;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_789
 * @Author: tgeuuy
 * @CreateTime: 2022-06-25  10:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 100005;
    public static int[] arr = new int[MAXSIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (m-- > 0) {
            int k = sc.nextInt();
            int[] res = findK(arr, 0, n - 1, k);
            System.out.println(res[0] + " " + res[1]);
        }
    }

    private static int[] findK(int[] arr, int l, int r, int k) {
        int tl = l, tr = r;
        int resl = -1, resr = -1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] < k) l = mid + 1;
            else r = mid;
        }
        if (arr[l] != k) return new int[]{-1, -1};
        resl = l;
        while (tl < tr) {
            int mid = tl + tr + 1 >> 1;
            if (arr[mid] > k) tr = mid - 1;
            else tl = mid;
        }
        resr = tr;
        return new int[]{resl, resr};

    }
}
