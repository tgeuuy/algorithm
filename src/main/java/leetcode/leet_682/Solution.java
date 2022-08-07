package leetcode.leet_682;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int res = calPoints(str);
        System.out.println("res=" + res);

    }

    public static int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            System.out.println(s);
            if (!"C".equals(s) && !"D".equals(s) && !"+".equals(s)) {
                int grade = get_Grade(s);
                stack.push(grade);
            }
            if ("C".equals(s) && !stack.isEmpty()) stack.pop();
            if ("D".equals(s)) {
                int s3 = 1;
                if (!stack.isEmpty()) s3 = stack.peek();
                stack.push(s3 * 2);
            }
            if (s.equals("+")) {
                int s1 = 0, s2 = 0;
                if (!stack.isEmpty()) s1 = stack.pop();
                if (!stack.isEmpty()) s2 = stack.pop();
                stack.push(s2);
                stack.push(s1);
                stack.push((s1) + (s2));
            }
        }
        for (int v : stack) res += v;
        return res;

    }

    private static int get_Grade(String op) {
        int i = 0;
        int res = 0;
        if (op.charAt(0) == '-') i = 1;


        for (; i < op.length(); i++) {
            res = res * 10 + op.charAt(i) - '0';
        }
        return op.charAt(0) == '-' ? res * (-1) : res;

    }
}
