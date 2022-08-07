package leetcode.leet_23;

import structurel.ListNode;

import java.util.List;

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
        node3.next = null;

        node4.next = node5;
        node5.next = node6;

        node6.next = null;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;

        ListNode[] list = {head1, node4, node7};

        ListNode res = mergeKLists(list);
        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
    }
    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoList(res, lists[i]);
        }
        return res;
    }
    private static ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a == null || b == null) return a == null ? b : a;
        ListNode pa = a, pb = b;
        ListNode res = new ListNode();
        ListNode tail = res;
        while (pa != null && pb != null) {
            if (pa.val < pb.val) {

                tail.next = pa;
                pa = pa.next;
            } else {

                tail.next = pb;
                pb = pb.next;
            }
            tail = tail.next;
        }
        tail.next = pa != null ? pa : pb;
        return res.next;
    }
}
