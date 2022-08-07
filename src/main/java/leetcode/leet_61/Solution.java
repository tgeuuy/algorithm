package leetcode.leet_61;

import structurel.ListNode;

import javax.swing.event.ListDataEvent;

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
        ListNode res = rotateRight(head1, 3);

        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
    }


    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int c = 0;
        for (ListNode p = head; p != null; p = p.next) {
            c++;
        }
        k = k % c;
        ListNode hhead = new ListNode();
        hhead.next = head;
        ListNode p = hhead;
        for (int i = 0; i <= k; i++) {
            p = p.next;
        }
        ListNode front = head;
        while (p.next != null) {
            p = p.next;
            front = front.next;
        }
        p.next = hhead.next;
        hhead.next = front.next;
        front.next = null;
        return hhead.next;
    }
}
