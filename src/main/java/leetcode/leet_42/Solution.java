package leetcode.leet_42;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = trap(arr);
        System.out.println("res=" + res);

    }

    public static int trap(int[] height) {
        if (height.length == 0 || height == null) return 0;
        int res = 0;
        Deque<Integer> st = new LinkedList<>();
        int n = height.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int top = st.pop();
                if (st.isEmpty()) break;
                int left = st.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                res += currHeight * currWidth;
            }
            st.push(i);
        }
        return res;
    }
}
