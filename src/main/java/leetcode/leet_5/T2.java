package leetcode.leet_5;

import org.omg.CORBA.PUBLIC_MEMBER;

public class T2 {

    public static void main(String[] args) {
        String str = "cbbd";
//        System.out.println(str.substring(0, 2));


        String res = longestPalindrome(str);

        System.out.println("res=" + res);


    }

    public static String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;


    }
}
