package leetcode.leet_3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int back = -1;  //右指针
        Set<Character> set = new HashSet<Character>();
        for (int front = 0; front < s.length(); front++) {
            if (front != 0) set.remove(s.charAt(front - 1));  //左指针向右移动一位删除一个字符
            while (back + 1 < s.length() && !set.contains(s.charAt(back + 1))) {
                set.add(s.charAt(back + 1));
                back++;
            }
            res = Math.max(res, back - front + 1);

        }
        return res;
    }

    @Test
    public void save() {
        String str = "abcabcbb";
        int len = lengthOfLongestSubstring(str);
        System.out.println(len);
    }
}
