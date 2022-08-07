package leetcode.leet_1030;

import org.junit.Test;

public class Solution {
        public int[][] allCellsDistOrder(int R, int C, int r0, int c0){
            int[][] re = new int[R * C][2];
            int dist = 0;
            int cnt = 0;
            int[] factor = {-1, 1};
            while (cnt < R * C) {
                for (int rowDist = 0; rowDist <= dist; rowDist++) {
                    int colDist = dist - rowDist;
                    for (int i = 0; i < 2; i++) {
                        int row = r0 + factor[i] * rowDist;
                        for (int j = 0; j < 2; j++) {
                            int col = c0 + factor[j] * colDist;
                            if (row >= 0 && row < R && col >= 0 && col < C) {
                                re[cnt][0] = row;
                                re[cnt][1] = col;
                                cnt++;
                            }
                            if (colDist == 0) break;
                        }
                        if (rowDist == 0) break;
                    }
                }
                dist++;
            }

            return re;
        }



    @Test
    public void practice() {
        int R = 2, C = 3, r0 = 1, c0 = 2;
        int[][] res = allCellsDistOrder(R, C, r0, c0);
        for (int i = 0; i < res.length; i++) {
            System.out.println("[" + res[i][0] + "," + res[i][1] + "]");
        }
    }
}
