package leetcode.leet_451;

import org.junit.Test;

import java.util.*;

public class Solution {


    @Test
    public void test() {
        System.out.println("res=" + frequencySort("tree"));
    }

    public String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
//        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Character, Integer> entry = iterator.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


        for (Map.Entry<Character, Integer> e : list) {
            int c = e.getValue();
            while (c-- != 0) {
                sb.append(e.getKey());
            }
//            System.out.println(e.getKey() + " " + e.getValue());
        }
        return sb.toString();
    }
}
