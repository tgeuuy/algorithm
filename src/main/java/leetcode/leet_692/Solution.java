package leetcode.leet_692;

import java.util.*;

public class Solution {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            }
            int num = map.get(words[i]);
            map.put(words[i], ++num);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        /*while (iter.hasNext()) {
            Map.Entry<String, Integer> item = iter.next();
            String key = item.getKey();
            int value = item.getValue();
            System.out.println("键" + key + "值" + value);
        }*/
        int i = 0;
        while (iter.hasNext()) {
            Map.Entry<String, Integer> item = iter.next();
            res.add(item.getKey());
            i++;
            if (i == k) break;

        }
        /*Set<String> set = map.keySet();
        for (String s : set) System.out.println(s);
        Object[] strs =  map.keySet().toArray();
        for (Object s : strs) System.out.println(s);
        for (int i = 0; i < k; i++) {
            res.add((String) strs[i]);
        }*/
    Collections.sort(res);
        return res;
    }


    public static void main(String[] args) {
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> res = topKFrequent(words, 4);
        for (String re : res) {
            System.out.println(re);
        }

    }
}
