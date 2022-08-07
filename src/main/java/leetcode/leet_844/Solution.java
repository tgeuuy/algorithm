package leetcode.leet_844;

import org.junit.Test;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sst = new Stack<Character>();
        Stack<Character> tst = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != '#') {
                sst.push(ch);
            } else {
                if (sst.empty()) {
                    continue;
                } else {
                    sst.pop();
                }
            }

        }
        for (int j = 0; j < T.length(); j++) {
            char ch = T.charAt(j);
            if (ch != '#') {
                tst.push(ch);
            } else {
                if (tst.empty()) {
                    continue;
                } else {
                    tst.pop();
                }
            }

        }
        if (sst.size() != tst.size()) return false;
        while (!sst.empty() && !tst.empty()) {
            if (sst.peek() != tst.peek()) return false;
            else {
                sst.pop();
                tst.pop();
            }
        }
        return true;





    }

    @Test
    public void practice() {
        String S = "xywrrmp";
        String T = "xywrrmu#p";
        boolean res = backspaceCompare(S, T);
        System.out.println(res);
        return;


    }
}
