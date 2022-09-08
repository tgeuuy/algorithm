package bishi.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Ti_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.abs(arr[i] - (i + 1));
        }
        System.out.println(res);
    }
}
