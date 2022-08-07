package leetcode.leet_516;

public class Solution {


    public static void main(String[] args) {
        String s = "bbbabb";
        int res = longestPalindromeSubseq(s);
        System.out.println("res=" + res);

    }

    public static int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) dp[i][i] = 1;
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;

                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                res = Math.max(dp[i][j], res);
            }

        }
        return res;
    }

}
