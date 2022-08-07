package leetcode.leet_14;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] ss = {"flower", "flow", "flight"};
        String res = longestCommonPrefix(ss);
        System.out.println("res=" + res);

    }

    public static String longestCommonPrefix(String[] strs) {
        if (check(strs)) {
            return "";
        }
        Arrays.sort(strs);
        int n = Math.min(strs[0].length(), strs[strs.length - 1].length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else break;
        }
        return sb.toString();

    }

    private static boolean check(String[] strs) {
        if (strs.length == 0 || strs == null) return true;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0 || strs[i].length() == 0) {
                return true;
            }
        }
        return false;
    }
}
