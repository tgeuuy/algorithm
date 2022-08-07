package leetcode.leet_1143;

public class Solution {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "ace";
        int res = longestCommonSubsequence(s, t);
        System.out.println("res = " + res);

    }


    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char c1 = text1.charAt(i - 1);
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];

    }
}
