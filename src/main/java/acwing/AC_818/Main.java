package acwing.AC_818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_818
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  21:47
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 1005;
    public static int[] arr = new int[MAXSIZE];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int n = Integer.valueOf(str1[0]);
        int l = Integer.valueOf(str1[1]);
        int r = Integer.valueOf(str1[2]);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(str2[i]);
        }

        sort(l, r);
        br.close();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int l, int r) {
        if (l > r) return;
        int i = l - 1, j = r + 1;
        int mid = arr[l + r >> 1];
        while (i < j) {
            do i++; while (mid > arr[i]);
            do j--; while (mid < arr[j]);
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }

        }
        sort(l, j);
        sort(j + 1, r);
    }
}
