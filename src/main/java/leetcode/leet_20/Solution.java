package leetcode.leet_20;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String str = "(){(()}()";
        boolean res = isValid(str);
        System.out.println("res = " + res);


    }

    public static boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty()) {
                char c = st.peek();
                if (c == '(' && ch == ')') {
                    st.pop();
                    continue;
                } else if (c == '[' && ch == ']') {
                    st.pop();
                    continue;
                } else if (c == '{' && ch == '}') {
                    st.pop();
                    continue;
                } else {
                    st.push(ch);
                }
            } else {
                st.push(ch);
            }

        }

        return st.isEmpty() == true;

    }
}
