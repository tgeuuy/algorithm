package leetcode.leet_463;

import org.junit.Test;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int con = 0;
                if (j == 0 || (grid[i][j - 1] == 0 && j != 0)) con++;
                if (j == col - 1 || grid[i][j + 1] == 0) con++;
                if (i == 0 || grid[i + 1][j] == 0) con++;
                if (i == row - 1 || (grid[i - 1][j] == 0 && i != 0)) con++;
                res += con;
            }
        }
        return res;
    }

    /**
     * j
     * i 0, 1, 0, 0
     * 1, 1, 1, 0
     * 0, 1, 0, 0
     * 1, 1, 0, 0
     */

    @Test
    public void practice() {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int res = islandPerimeter(grid);
        System.out.println("res=" + res);
    }
}
