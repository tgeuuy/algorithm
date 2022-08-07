package leetcode.leet_3;

import org.junit.Test;

import java.util.*;

/**
 * 用滑动窗口解决问题
 * 以 (a)bcabcbb 开始的最长字符串为 \texttt{(abc)abcbb}(abc)abcbb；
 * 以 a(b)cabcbb 开始的最长字符串为 \texttt{a(bca)bcbb}a(bca)bcbb；
 * 以 ab(c)abcbb 开始的最长字符串为 \texttt{ab(cab)cbb}ab(cab)cbb；
 * 以 abc(a)bcbb 开始的最长字符串为 \texttt{abc(abc)bb}abc(abc)bb；
 * 以 abca(b)cbb 开始的最长字符串为 \texttt{abca(bc)bb}abca(bc)bb；
 * 以 abcab(c)bb 开始的最长字符串为 \texttt{abcab(cb)b}abcab(cb)b；
 * 以 abcabc(b)b 开始的最长字符串为 \texttt{abcabc(b)b}abcabc(b)b；
 * 以 abcabcb(b) 开始的最长字符串为 \texttt{abcabcb(b)}abcabcb(b)。
 *

 */
public class Solution2 {
    public  int lengthOfLongestSubstring(String s) {
        int res=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for (int i=0,j=0; j<s.length();j++){
            char chj =s.charAt(j);
            map.put(chj,map.getOrDefault(chj,0)+1);
            while (map.get(chj)>1) {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
    @Test
    public void save() {
        String str = "abcabcbb";
        int len= lengthOfLongestSubstring(str);
        System.out.println(len);
    }
}
