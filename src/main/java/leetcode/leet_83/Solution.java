package leetcode.leet_83;

import structurel.ListNode;

public class Solution {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dhead = new ListNode();
        dhead.next = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;

            }
            fast = fast.next;
            slow.next = null;
        }
        return dhead.next;

    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(8);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;


        for (ListNode p = head1; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
        deleteDuplicates(head1);

        for (ListNode p = head1; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }

    }


}
