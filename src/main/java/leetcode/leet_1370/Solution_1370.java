package leetcode.leet_1370;

import org.junit.Test;

public class Solution_1370 {


//    public void sort(char[] s, int l, int r) {
//        if (l >= r) return;
//        int i = l - 1, j = r + 1;
//        int m = (l + r) >> 1;
//        while (i < j) {
//            do i++; while (s[i] < s[m]);
//            do j--; while (s[j] > s[m]);
//            if (i < j) {
//                char p = s[i];
//                s[i] = s[j];
//                s[j] = p;
//
//            }
//        }
//        sort(s, l, j);
//        sort(s, j + 1, r);
//    }


    public String sortString(String s) {
        int[] ret = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ret[s.charAt(i) - 'a']++;
        }
        StringBuffer ss = new StringBuffer();
        while (ss.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (ret[i] > 0) {
                    ss.append((char) ('a' + i));
                    ret[i]--;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (ret[j] > 0) {
                    ss.append((char) ('a' + j));
                    ret[j]--;
                }
            }
        }
        return ss.toString();
    }


    @Test
    public void practice() {
        String s = "aaaabbbbcccc";

        String res = sortString(s);

        System.out.println("res=" + res);

    }
}
