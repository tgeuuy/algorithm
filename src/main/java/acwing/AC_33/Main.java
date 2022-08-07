package acwing.AC_33;

import structurel.ListNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/25 9:31
 * @Version 1.0
 */
public class Main {
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

        ListNode res = findKthToTail(head1, 3);
        System.out.println("res=" + res.val);
    }

    public static ListNode findKthToTail(ListNode pListHead, int k) {
        if (pListHead == null) return null;
        ListNode right = pListHead;
        for (int i = 0; i < k; i++) {
            if (right == null) {
                return null;
            } else {
                right = right.next;
            }
        }

        while (right != null) {
            pListHead = pListHead.next;
            right = right.next;
        }

        return pListHead;


    }
}
