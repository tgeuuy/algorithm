package zati.String_Solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 16:40
 * @Version 1.0
 */
public class leet_3 {
    public static void main(String[] args) {
        String str = "abcabcbb";


        int res = lengthOfLongestSubstring(str);
        System.out.println("res=" + res);

    }


    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int back = -1;
        Set<Character> set = new HashSet<>();
        for (int front = 0; front < s.length(); front++) {
            if (front != 0) set.remove(s.charAt(front - 1));
            while (back + 1 < s.length() && !set.contains(s.charAt(back + 1))) {
                set.add(s.charAt(back + 1));
                back++;
            }
            res = Math.max(res, back - front + 1);
        }
        return res;


    }
}
