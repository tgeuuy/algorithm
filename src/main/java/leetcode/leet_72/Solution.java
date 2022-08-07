package leetcode.leet_72;

public class Solution {


    public static void main(String[] args) {

        String word1 = "horse";
        String word2 = "ros";

        int res = minDistance(word1, word2);
        System.out.println("res = " + res);

    }

    public static int minDistance(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 * l2 == 0) {
            return l1 + l2;
        }
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int i = 0; i <= l1; i++) dp[i][0] = i;
        for (int i = 0; i <= l2; i++) dp[0][i] = i;
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        /**
         * 动态规划：
         * dp[i][j] 代表 word1 到 i 位置转换成 word2 到 j 位置需要最少步数
         * 所以，
         * 当 word1[i] == word2[j]，dp[i][j] = dp[i-1][j-1]；
         * 当 word1[i] != word2[j]，dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1
         * 其中，dp[i-1][j-1] 表示替换操作，dp[i-1][j] 表示删除操作，dp[i][j-1] 表示插入操作。
         */
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i - 1) != s2.charAt(j - 1)) dp[i - 1][j - 1] += 1;
                dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1]));
            }
        }
        System.out.println(s1);
        System.out.println(s2);

        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[l1][l2];

    }
}
