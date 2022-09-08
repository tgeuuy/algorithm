package leetcode.leet_476;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        int res = findComplement(n);
        System.out.println("res = " + res);
    }

    public static int findComplement(int num) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        while (num != 0) {
            int a = (num & 1) == 1 ? 0 : 1;
            stack.push(a);
            num >>= 1;
            System.out.println(a);
        }
        while (!stack.isEmpty()&&stack.peek() == 0) stack.pop();
        while (!stack.isEmpty()) {
            int aa = stack.pop();
            System.out.println(aa);
            res = 2 * res + aa;
        }


        return res;
    }
}
