package leetcode.leet_472;

import javax.xml.bind.annotation.W3CDomHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author tgeuuy
 * @Date 2021/12/28 11:23
 * @Version 1.0
 */
public class Solution {
   static Trie trie = new Trie();

    public static void main(String[] args) {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> res = findAllConcatenatedWordsInADict(words);
        System.out.println(res.toString());


    }


    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0) {
                continue;
            }
            if (dfs(word, 0)) {
                ans.add(word);
            } else {
                insert(word);
            }
        }
        return ans;

    }

    private static boolean dfs(String word, int s) {
        if (word.length() == s) return true;
        Trie node = trie;
        for (int i = s; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            node = node.children[index];
            if (node == null) {
                return false;
            }
            if (node.isEnd) {
                if (dfs(word, i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void insert(String word) {
        Trie node = trie;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;

    }

    public static class Trie {
        Trie[] children;
        boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }
    }
}


