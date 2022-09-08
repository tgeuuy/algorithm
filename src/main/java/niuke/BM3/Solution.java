package niuke.BM3;

import structurel.ListNode;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        ListNode res = reverseKGroup(head, 2);
        for (ListNode node = head; node != null; node = node.next) {
            System.out.print(node.val + " ");
        }


    }

    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode left = new ListNode(-1);
        ListNode p = new ListNode(-1);

        p.next = head;
        left = p;
        for (ListNode node = head; node != null; node = node.next) {
            ListNode pp = left.next;
            left.next = reverse(node, k);
            int i = 0;
            while (node.next != null && i < k) {
                node = node.next;
                i++;
            }
            left = node;
            pp.next = node.next;
        }
        return p.next;
        // write code here
    }

    public static ListNode reverse(ListNode head, int k) {
        if (head == null) return head;
        ListNode pre = null;
        while (head != null && k-- >= 0) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre.next;
    }
}