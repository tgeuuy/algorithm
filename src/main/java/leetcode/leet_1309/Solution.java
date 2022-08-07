package leetcode.leet_1309;

public class Solution {
    public static void main(String[] args) {
        // jkab
        String s = "10#11#12";
        String str = freqAlphabets(s);
        System.out.println("res = " + str);

    }

    public static String freqAlphabets(String s) {
        int len = s.length();
        if (len == 0 || s == null) return new String();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                int sum = (ch1 - '0') * 10 + (ch2 - '0');
                sb.append(Character.toChars( 'a' + sum-1));
                i += 2;
            } else {
                int ch3 = s.charAt(i)-'0';
                sb.append(Character.toChars ('a' + ch3-1));
            }
        }
        return sb.toString();
    }
}
