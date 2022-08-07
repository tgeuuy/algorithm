package jzoffer.jz_9;


import java.util.Stack;

public class CQueue {
    public Stack<Integer> s1;
    public Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);

    }

    public int deleteHead() {
        if (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        } else {
            return -1;
        }

        int val = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;

    }
}
