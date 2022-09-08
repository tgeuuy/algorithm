package bishi.meituan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ti_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tatol = sc.nextInt();
        int n = sc.nextInt();
        int[] need = new int[tatol];
        int[] time = new int[tatol];
        for (int i = 0; i < tatol; i++) need[i] = sc.nextInt();
        for (int i = 0; i < tatol; i++) time[i] = sc.nextInt();
        if (need[0] > n) {
            System.out.println(-1);
            return;
        }
        int[][] f = new int[tatol + 1][tatol + 1];
        f[0][ 0] = 0;
        f[0][1] = 21;
        for(int i = 0 ; i <= tatol ; i ++){
            for (int j = 0; j <= tatol; j++) {

            }
        }


    }
}
