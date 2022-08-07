package bishi;

import java.util.Scanner;

public class RongYao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[][] arr = new int[3][3];
            int one = 0;
            int two = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] == 1) one++;
                    else if (arr[i][j] == 2) two++;
                }
            }
            System.out.println(check(arr, one, two));

        }
    }

    private static int check(int[][] arr, int one, int two) {
        if (ch(arr, 1) == 1 && ch(arr, 2) == 2) return -1;
        if (ch(arr, 1) == 1) return 1;
        if (ch(arr, 2) == 2) return 2;
        int n = 0;
        if (one > two) n = 2;
        else if (one < two) n = 1;
        System.out.println("n=" + n);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = n;
                    if (ch(arr, n) == n) return n;
                    arr[i][j] = 0;
                }
            }
        }
        return -1;
    }


    private static int ch(int[][] arr, int n) {
        int falg = 0;
        if (arr[0][0] == arr[0][1] && arr[0][2] == arr[0][1] && arr[0][0] == n) return arr[0][0];
        if (arr[1][0] == arr[1][1] && arr[1][2] == arr[1][1] && arr[1][0] == n) return arr[1][0];
        if (arr[2][0] == arr[2][1] && arr[2][2] == arr[2][1] && arr[2][0] == n) return arr[2][0];
        if (arr[0][0] == arr[1][0] && arr[2][0] == arr[1][0] && arr[0][0] == n) return arr[0][0];
        if (arr[0][1] == arr[1][1] && arr[2][1] == arr[1][1] && arr[0][1] == n) return arr[0][1];
        if (arr[0][2] == arr[1][2] && arr[2][2] == arr[1][2] && arr[0][2] == n) return arr[0][2];
        if (arr[0][0] == arr[1][1] && arr[2][2] == arr[1][1] && arr[0][0] == n) return arr[0][0];
        if (arr[0][2] == arr[1][1] && arr[2][0] == arr[0][2] && arr[0][2] == n) return arr[0][2];
        return falg;
    }
}
