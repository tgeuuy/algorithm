package leetcode.leet_438;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "abab", p = "ab";
        List<Integer> res = findAnagrams(s, p);
        System.out.println(res.toString());
    }


    public static List<Integer> findAnagrams(String s, String p) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < p.length(); i++) set.add(p.charAt(i));
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;


        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int l = i, r = i + p.length() - 1;
            while (l <= r  && set.contains(s.charAt(l))) l++;
            if (l - 1 == r) {
                res.add(i);
            }
        }
        return res;


    }
}
