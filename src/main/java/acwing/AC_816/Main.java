package acwing.AC_816;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 15:47
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int i = 0;
        int j = m - 1;
        while (i < j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }

        for (int v : arr)
            System.out.print(v + " ");
    }
}
