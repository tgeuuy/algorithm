package acwing.AC_20;

import java.util.Stack;

/**
 * @Author tgeuuy
 * @Date 2021/11/18 9:27
 * @Version 1.0
 */
public class Main {
    class MyQueue {

        public Stack<Integer> st1;
        public Stack<Integer> st2;


        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            st1.add(x);
        }

        public int pop() {
            while (!st1.isEmpty()) {
                st2.add(st1.pop());
            }
            int popValue = st2.pop();
            while (!st2.isEmpty()) {
                st1.add(st2.pop());
            }

            return popValue;

        }

        public int peek() {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int peekValue = st2.peek();
            while (!st2.isEmpty()) {
                st1.add(st2.pop());
            }
            return peekValue;
        }

        public boolean empty() {
            return st1.isEmpty();
        }
    }


}
