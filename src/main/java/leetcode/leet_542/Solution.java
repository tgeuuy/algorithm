package leetcode.leet_542;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] res = updateMatrix(mat);
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(re[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        int n = mat.length, m = mat[0].length;
        int[][] res = new int[n][m];
        boolean[][] st = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = 0;
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    st[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int x = pair[0], y = pair[1];
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i], b = y + dy[i];
                if (a >= 0 && a < n && b >= 0 && b < m && !st[a][b]) {
                    res[a][b] = res[x][y] + 1;
                    queue.offer(new int[]{a, b});
                    st[a][b] = true;
                }
            }
        }
        return res;
    }
}
