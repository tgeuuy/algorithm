package leetcode.leet_141;

import structurel.ListNode;
import org.junit.Test;

public class Solution {
    @Test
    public void practice() {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node6;
        node6.next = node5;
        node5.next = node2;

        boolean res = hasCycle(head);
        System.out.println("res=" + res);
    }


    public boolean hasCycle(ListNode head) {

        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) return true;
        }
        return false;
    }
}
