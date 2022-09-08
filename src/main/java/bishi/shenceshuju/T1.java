package bishi.shenceshuju;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int res = 0;
        int max = arr[0] + 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i] + i, max);
            res = Math.max(res, max + arr[i] - i);
            System.out.println(max + arr[i] - i + " " + max + " " + res);

        }
        System.out.println(res);
    }
}
