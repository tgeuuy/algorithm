package acwing.AC_813;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_813
 * @Author: tgeuuy
 * @CreateTime: 2022-07-02  23:16
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        print2D(a, col, row);
        sc.close();
        return;


    }

    public static void print2D(int[][] a, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
