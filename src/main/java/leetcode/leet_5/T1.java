package leetcode.leet_5;

public class T1 {
    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(str.substring(0, 2));


        String res = longestPalindrome(str);

        System.out.println("res=" + res);


    }


    public static String longestPalindrome(String s) {
        if (s == null) return null;
        int len = s.length();
        int[][] dp = new int[len][len];
        int l = 0, r = 0;
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i + 1][j - 1] + 2;
                else {
                    dp[i][j] = Math.max(dp[i][j], Math.max(dp[i + 1][j], dp[i][j - 1]));

                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int max = -1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dp[i][j] > max) {
                    l = i;
                    r = j;
                    max = dp[i][j];
                }
            }
        }
        System.out.println(l + "  " + r);


        return s.substring(l, l + max);


    }
}
