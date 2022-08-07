package leetcode.leet_415;

public class Solution {
    public static void main(String[] args) {
        String a = "99";
        String b = "999";
        String res = addStrings(a, b);
        System.out.println("res = " + res);


    }

    public static String addStrings(String a, String b) {
        if (a.length() < b.length()) return addStrings(b, a);
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            c += i >= 0 ? a.charAt(i) - '0' : 0;
            c += j >= 0 ? b.charAt(j) - '0' : 0;
            sb.append(c % 10);
            c /= 10;
            i--;
            j--;
        }
        if (c == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
