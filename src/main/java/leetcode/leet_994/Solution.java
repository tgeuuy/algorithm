package leetcode.leet_994;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int res = orangesRotting(grid);
        System.out.println(res);
    }

    public static int orangesRotting(int[][] grid) {
        int res = 0;
        int n = grid.length, m = grid[0].length;
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        boolean[][] st = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    flag = true;
                    break;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        if (flag)
            return res;


        return res;
    }
}
