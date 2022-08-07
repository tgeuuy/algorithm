package leetcode.leet_242;

import org.junit.Test;

import java.util.Arrays;


public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        boolean res=true;
        for (int i=0;i<t.length();i++){
            if (sc[i]!=tc[i]) res=false;
        }
        return res;

    }

    @Test
    public void practic() {
        String s = "anagram";
        String t = "nagaram";
        boolean res = isAnagram(s, t);
        System.out.println(res);
        return;
    }
}
