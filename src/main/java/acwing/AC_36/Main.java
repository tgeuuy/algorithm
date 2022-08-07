package acwing.AC_36;

import structurel.ListNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/26 9:27
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node8 = new ListNode(8);


        ListNode head2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node7 = new ListNode(7);
        ListNode node9 = new ListNode(9);

        head1.next = node3;
        node3.next = node5;
        node5.next = node6;
        node6.next = node8;
        node8.next = null;

        head2.next = node4;
        node4.next = node7;
        node7.next = node9;
        node9.next = null;


        for (ListNode p = head1; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
        for (ListNode p = head2; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();

        ListNode res = merge(head1, head2);

        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();
    }


    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = new ListNode();
        ListNode r = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                r.next = l1;
                r = l1;
                l1 = l1.next;
            } else {
                r.next = l2;
                r = l2;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            r.next = l1;
            r = l1;
            l1 = l1.next;

        }
        while (l2 != null) {
            r.next = l2;
            r = l2;
            l2 = l2.next;

        }
        r.next = null;
        return res.next;

    }


}
