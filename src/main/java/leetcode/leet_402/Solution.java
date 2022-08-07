package leetcode.leet_402;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int k = 3;
        String num = "1432219";

        String res = removeKdigits(num, k);
        System.out.println("res=" + res);

    }


    public static String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        int le = num.length();
        for (int i = 0; i < le; i++) {
            char ch = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > ch) {
                deque.pollFirst();
                k--;
            }
            deque.offerLast(ch);
        }
        for (int i = 0; i < k; i++) {
            deque.pollLast();
        }
        StringBuilder res = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char ch = deque.pollFirst();
            if (leadingZero && ch == '0') {
                continue;
            }
            leadingZero = false;
            res.append(ch);
        }
        return res.length() == 0 ? "0" : res.toString();

    }
}
