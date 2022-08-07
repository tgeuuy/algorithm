package acwing.AC_104;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  15:55
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int res = 0;
        for (int v : arr) res += Math.abs(v - arr[n >> 1]);
        System.out.println(res);
    }
}
