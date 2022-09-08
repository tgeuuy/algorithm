package leetcode.leet_6160;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
        int[] res = answerQueries(nums, queries);
        for (int v : res) System.out.print(v + " ");
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int q = queries.length;
        int[] res = new int[q];
        int t = 0;
        while (t < queries.length) {
            int[][] f = new int[nums.length + 1][queries[t]];
            int tt = 0;
            for (int i = 1; i < nums.length; i++) {
                for (int j = 1; j < queries[t]; j++) {
                    f[i][j] = f[i - 1][j];
                    if (j < queries[t]) f[i][j] = Math.max(tt, f[i][j - queries[t]] + 1);

                }
            }
            t++;
        }
        return res;

    }
}
