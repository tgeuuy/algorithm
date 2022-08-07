package leetcode.leet_445;

import structurel.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode head2 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        head2.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;

        ListNode res = addTwoNumbers(head1, head2);

        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();


    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        for (ListNode p = h2; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
        ListNode dhead = new ListNode(-1);
        int c = 0;
        while ((h1 != null && h2 != null )) {
            int a = h1 == null ? 0 : h1.val;
            int b = h2 == null ? 0 : h2.val;
            int t = a + b + c;
            ListNode node = new ListNode(t % 10);
            c = t / 10;
            node.next = dhead.next;
            dhead.next = node;
            h1 = h1.next;
            h2 = h2.next;
        }

        if (c == 1) {
            ListNode node = new ListNode(1);
            node.next = dhead.next;
            dhead.next = node;
        }
        while (h1 != null) {
            ListNode node = new ListNode(c + h1.val);
            node.next = dhead.next;
            dhead.next = node;
            c = (c + h1.val) / 10;
            h1 = h1.next;
        }

        while (h2 != null) {
            ListNode node = new ListNode(c + h2.val);
            node.next = dhead.next;
            dhead.next = node;
            c = 0;
            c = (c + h2.val) / 10;
            h2 = h2.next;
        }

        return dhead.next;

    }

    private static ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode pre = null, next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
