package leetcode.leet_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }

    public static int[][] merge(int[][] intervals) { 
        if (intervals == null) return new int[0][2];
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
//        for (int i = 0; i < intervals.length; i++) {
//            System.out.println(intervals[i][0] + " " + intervals[i][1]);
//        }
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0], R = intervals[i][1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < L) {
                res.add(new int[]{L, R});
            } else {
                // 左边已经排好序，右边取最大值。
                res.get(res.size() - 1)[1] = Math.max(R, res.get(res.size() - 1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }


}
