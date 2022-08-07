package acwing.AC_737;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 10:22
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n <= 0) arr[i] = -1;
            else arr[i] = n;
        }
        for (int i = 0; i < 10; i++) System.out.println("X[" + i + "]=" + arr[i]);

    }
}
