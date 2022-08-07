package leetcode.leet_1314;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        int[][] res = matrixBlockSum(arr, k);
        for (int[] v : res) System.out.print(Arrays.toString(v));

    }


    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length, m = mat.length;
        int[][] f = new int[n + 1][m + 1];
        int[][] res = new int[n][m];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) f[i][j] = 0;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                f[i][j] = f[i - 1][j] + f[i][j - 1] - f[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }
        for (int[] v : f) System.out.print(Arrays.toString(v));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int il = i - k;
                il = il < 0 ? 0 : il;
                int ir = i + k;
                ir = ir > n ? n - 1 : ir;
                int jl = j - k;
                jl = jl < 0 ? 0 : jl;
                int jr = j + k;
                jr = jr > m ? m - 1 : jr;
                System.out.println(il + " " + ir + " " + jl + " " + jr);
                res[i][j] = f[ir][jr] - f[ir][jl] - f[il][jr] + f[il][jl];
                System.out.println(res[i][j]);
            }
        }
        return res;

    }
}
