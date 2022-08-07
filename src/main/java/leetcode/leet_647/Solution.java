package leetcode.leet_647;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String str = "hello";
        int res = countSubstrings(str);
        System.out.println("res = " + res);
    }

    private static int countSubstrings(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (check(str, i, j)) {
                    System.out.println(str.substring(j, i + 1));
                    res++;
                }
            }
        }
        return res;
    }

    private static boolean check(String str, int i, int j) {
        String s = str.substring(j, i + 1);

//        System.out.println(s);
        int a = 0, b = s.length() - 1;
        if (s.length() == 1) return true;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) return false;
            a++;
            b--;
        }
       return true;
    }
}
