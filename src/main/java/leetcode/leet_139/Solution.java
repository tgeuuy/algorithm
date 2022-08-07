package leetcode.leet_139;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        String s = "aaaaaaa";
        String[] wordDic = {"aaa", "aaaa"};
        List<String> wordDict = Arrays.asList(wordDic);
        boolean res = wordBreak(s, wordDict);
        System.out.println("res=" + res);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>(wordDict);
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j, i);
                if (dp[j] && set.contains(str)) {
                    dp[i] = true;
                    break;
                }
            }

        }

        return dp[s.length() ];
    }
}
