package acwing.AC_727;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_727
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  14:47
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cx = n / 2;
        int cy = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - cx) + Math.abs(j - cy) <= n / 2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

        }


    }
}
