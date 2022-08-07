package leetcode.leet_316;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {


    public String removeDuplicateLetters(String s) {
        String res = new String();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (char ch : set) {
            res += ch;
        }
        char[] chs = res.toCharArray();
        Arrays.sort(chs);
//        for (char ch:chs){
//            System.out.println(ch);
//        }
        return new String(chs);
    }

    @Test
    public void practice() {
        String s = "sadasdadddadsayyydddd";
        String res = removeDuplicateLetters(s);
        System.out.println("res=" + res);
    }
}
