package leetcode.leet_17;

import org.junit.Test;

import java.util.*;

public class Solution {
    @Test
    public void test() {
        List<String> res = letterCombinations("23");
        for (String s : res) System.out.println(s);
    }


    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        HashMap<Character, List<Character>> map = new HashMap<>();
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        for (Map.Entry<Character, List<Character>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (int i = 0; i < digits.length(); i++) {
            ArrayList<Character> a = new ArrayList<>();


        }
        return res;

    }

}
