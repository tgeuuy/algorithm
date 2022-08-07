package leetcode.leet_24;

import structurel.ListNode;

public class Solution {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);

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

        ListNode res = swapPairs(head1);

        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
    }


    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode left = head;
        ListNode right = null;
        ListNode dhead = new ListNode();
        dhead.next = left;
        ListNode pre = dhead;
        ListNode next = null;
        while (left != null && left.next != null) {
            right = left.next;
            next = right.next;

            pre.next = right;

            right.next = left;
            left.next = next;

            pre = left;


            left = next;

        }
//        left.next = null;
        return dhead.next;
    }
}
