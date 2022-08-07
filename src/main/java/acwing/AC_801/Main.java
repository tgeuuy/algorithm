package acwing.AC_801;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_801
 * @Author: tgeuuy
 * @CreateTime: 2022-07-03  23:25
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int v : arr) printONE(v);
    }

    public static void printONE(int v) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((v >> i & 1) == 1) res++;
        }
        System.out.println(res + " ");
    }
}
