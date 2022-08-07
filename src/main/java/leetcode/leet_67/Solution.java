package leetcode.leet_67;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) {


        String a = "11";
        String b = "1";

        String res = addBinary(a, b);

        System.out.println("res = " + res);
    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) return addBinary(b, a);
        List<Integer> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        StringBuilder aa = new StringBuilder(a);
        StringBuilder bb = new StringBuilder(b);
        aa.reverse();
        bb.reverse();
        int t = 0;
        for (int i = 0; i < aa.length(); i++) {
            t += aa.charAt(i) - '0';
            if (i < bb.length()) t += bb.charAt(i) - '0';
            list.add(t % 2);
            t /= 2;
        }
        if (t == 1) list.add(t);
        for (int i = list.size() - 1; i >= 0; i--) res.append(list.get(i));
        return res.toString();
    }
}
