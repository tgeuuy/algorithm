package jzoffer.jz_6;

import structurel.ListNode;
import org.junit.Test;


public class Solution {
    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        int[] res = reversePrint(head);
        for (int v : res) {
            System.out.println(v);
        }

    }

    private int[] reversePrint(ListNode head) {
        if (head == null) return new int[]{};
        int len = 0;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            len++;
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;

        }
        int[] res = new int[len];
        int i = 0;
        while (pre != null) {
            res[i++] = pre.val;
            pre = pre.next;
        }
        return res;
    }

   /* public int[] reversePrint(ListNode head) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        while (!s.isEmpty()) {
            res.add(s.pop());
        }
        int[] rr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            rr[i] = res.get(i);
        }
        return rr;
    }*/
}
