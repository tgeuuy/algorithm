package acwing.AC_61;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 15:50
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String s = "ababcasdfghjkll";
        int res = longestSubstringWithoutDuplication_1(s);
        System.out.println("res=" + res);
    }

    private static int longestSubstringWithoutDuplication(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.get(s.charAt(j)) > 1) {
                while (i < j) {
                    int c = map.get(s.charAt(i)) - 1;
                    map.put(s.charAt(i), c);
                    i++;
                    if (map.get(s.charAt(j)) == 1) break;
                }
            }

            res = Math.max(res, j - i + 1);
        }
        return res;

    }

    private static int longestSubstringWithoutDuplication_1(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j >= 0; j--) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                if (map.get(s.charAt(j)) > 1) break;
                else {
                    res = Math.max(res, i - j + 1);
                }
            }
            System.out.println();
        }
        return res;
    }

}
