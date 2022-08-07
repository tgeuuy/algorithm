package acwing.AC_753;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/11 16:28
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(Math.min(Math.min(i, j), Math.min(n - i + 1, n - j + 1)) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

