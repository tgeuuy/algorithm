package acwing.AC_738;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 15:32
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        arr[0] = sc.nextInt();
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] + arr[i - 1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("N[" + i + "]=" + arr[i]);
        }


    }
}
