package test.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res = result(arr);
        System.out.println("res=" + res);
    }

    private static int result(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
//                    System.out.println(get(arr, i, j));
                    ans += get(arr, i, j);
                }
            }
        }
        return ans;
    }

    private static int get(int[][] arr, int x, int y) {
        int ans1 = 0;
        int i = x - 1;
        while (i >= 0) {
            if (arr[i][y] == 1) {
                ans1++;
                break;
            }
            i--;
        }
        int p = x + 1;
        while (p < arr.length) {
            if (arr[p][y] == 1) {
                ans1++;
                break;
            }
            p++;
        }
        int j = y - 1;
        while (j >= 0) {
            if (arr[x][j] == 1) {
                ans1++;

                break;
            }
            j--;
        }
        int q = y + 1;
        while (q < arr[x].length) {
            if (arr[x][q] == 1) {
                ans1++;

                break;
            }
            q++;
        }
        return ans1;
    }
}
