package test;

import structurel.ListNode;

public class LinkList {

    public static void main(String[] args) {
        ListNode h = new ListNode(3);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);

        h.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;


        ListNode dd = new ListNode(-1);
        dd.next = h;
        for (ListNode node = h; node.next != null; node = node.next) {
            ListNode pre = node;
            ListNode cur = node.next;
            ListNode max = node;

            for (; cur != null;  cur = cur.next,pre = pre.next) {
                if (max.val < cur.val) {
                    max = cur;
                }
            }
            pre.next = max.next;
            max.next = dd.next;
            dd.next = max;

        }
        for (ListNode n = dd.next; n != null; n = n.next) {
            System.out.println(n);
        }


    }
}
