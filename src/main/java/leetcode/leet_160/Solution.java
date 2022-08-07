package leetcode.leet_160;

import structurel.ListNode;
import org.junit.Test;

public class Solution {
    @Test
    public void practice() {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);


        ListNode head2 = new ListNode(9);
        ListNode node6 = new ListNode(8);

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);


        head1.next = node2;
        node2.next = node3;
        node3.next = node4;


        head2.next = node6;
        node6.next = node4;


        node4.next = node5;
        node5.next = null;


        ListNode node = getIntersectionNode(head1, head2);
        System.out.println("node="+node.val);


    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 == null) p1 = headB;
            else p1 = p1.next;
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;

    }


}
