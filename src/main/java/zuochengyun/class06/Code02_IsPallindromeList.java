package zuochengyun.class06;

import java.util.Stack;

public class Code02_IsPallindromeList {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }


    public static boolean isPalindRome1(Node head) {
        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
