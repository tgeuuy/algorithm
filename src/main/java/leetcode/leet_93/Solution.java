package leetcode.leet_93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static final int SEG_COUNT = 4;
    static List<String> res = new ArrayList<>();
    static int[] segments;

    public static void main(String[] args) {
        String s = "192001";
        List<String> ss = restoreIpAddresses(s);
        for (String str : ss) System.out.println(str);
        System.out.println();
    }


    public static List<String> restoreIpAddresses(String s) {
        segments = new int[SEG_COUNT];
        dfs(s, 0, 0);
        return res;

    }

    private static void dfs(String s, int segId, int segStart) {
        if (segId == SEG_COUNT) {
            if (segStart == s.length()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < SEG_COUNT; i++) {
                    sb.append(segments[i]);
                    if (i != SEG_COUNT - 1) {
                        sb.append('.');
                    }
                }
                res.add(sb.toString());
            }
            return;
        }

        if (segStart == s.length()) return;

        if (s.charAt(segStart) == '0') {
            segments[segId] = 0;
            dfs(s, segId + 1, segStart + 1);
        }

        int addr = 0;
        for (int segEnd = segStart; segEnd < s.length(); segEnd++) {
            addr = addr * 10 + s.charAt(segEnd) - '0';
            if (addr > 0 && addr < 256) {
                segments[segId] = addr;
                dfs(s, segId + 1, segEnd + 1);
            } else {
                break;
            }
        }

    }


}
