package string.INleet_16_26;

import org.junit.Test;

import java.util.Stack;

public class Solution {

    public int calculate(String s) {
        char[] chars = s.trim().toCharArray();
        Stack<Integer> st = new Stack<Integer>();
        int res = 0;

        return res;
    }

    @Test
    public void practice() {
        String str = "3+2*2";
        int res = calculate(str);
        System.out.println("res=" + res);
    }
}
