package leetcode.leet_409;

import org.junit.Test;

import java.util.*;

public class Solution {
    @Test
    public void test() {
        String s = "bananas";
        System.out.println(longestPalindrome((s)));

    }

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int o = 0;
        List<Integer> list = new ArrayList<>();

        for (Character ch : map.keySet()) {
            if ((map.get(ch) & 1) == 0) o += map.get(ch);
            else list.add(map.get(ch));
        }

        Collections.sort(list);
        System.out.println(list);
        return o +list.get(list.size() - 1);


    }
}
