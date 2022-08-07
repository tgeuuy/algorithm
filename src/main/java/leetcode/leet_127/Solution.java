package leetcode.leet_127;

import org.junit.Test;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for (String word : wordList) set.add(word);
//        for (String word : set) {
//            System.out.println(word);
//        }
        Map<String, Integer> dist = new HashMap<>();
        dist.put(beginWord, 0);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        while (!q.isEmpty()) {
            String t = q.poll(); //t为队首元素
            //System.out.println(t);
            String r = t;     //r为队首元素
            for (int i = 0; i < t.length(); i++) {//遍历开始字母的每一个元素
                t = r;
                for (char j = 'a'; j <= 'z'; j++) {
                    t = t.substring(0, i) + j + t.substring(i + 1);
                    //System.out.println(t+"              dsdssd");
                    if (set.contains(t) && !dist.containsKey(t)) {

                        int dis = dist.get(r) + 1;
                       // System.out.println(dis+"     asas");
                        dist.put(t, dis);
                        if (t.equals(endWord)) return dist.get(t) + 1;
                        q.offer(t);

                    }
                }
            }
        }

        return 0;
    }

    @Test
    public void practice() {
        String beginWord = "hit";
        String endWord = "cog";
        //List<String> list = {"hot", "dot", "dog", "lot", "log", "cog"};
        //List<String> list=new ArrayList<>("hot", "dot", "dog", "lot", "log", "cog");
        List<String> list = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int res = ladderLength(beginWord, endWord, list);
        System.out.println(res);

    }
}
