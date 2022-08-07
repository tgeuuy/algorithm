package leetcode.leet_1190;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String str = "a(bcdefghijkl(mno)p)q";

        String res = reverseParentheses(str);
        System.out.println("res=" + res);
    }

    public static String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(res.toString());
                res.setLength(0);
            } else if (ch == ')') {
                res.reverse();
                res.insert(0, st.pop());
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }


}
