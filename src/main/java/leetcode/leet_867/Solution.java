package leetcode.leet_867;

import org.junit.Test;

public class Solution {


    public int[][] transpose(int[][] A) {
        int row = A[0].length;  //转置后的矩阵行数
        int col = A.length; //转置后的矩阵列数
        int[][] res = new int[row][col];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                    res[i][j]=A[j][i];
            }


        }

        return res;

    }

    @Test
    public void practice() {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = transpose(array);
        for (int i = 0; i < res[0].length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
