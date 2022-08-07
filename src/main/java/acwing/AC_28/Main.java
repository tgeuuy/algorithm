package acwing.AC_28;

import structurel.ListNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/23 9:26
 * @Version 1.0
 */
public class Main {
    public static ListNode head = new ListNode(0);

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

        head.next = head1;
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;


        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val + " ");

        }
        System.out.println();
        deleteNode(node4);

        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val + " ");

        }


    }


    public static void deleteNode(ListNode node) {
        ListNode p=node.next;
        node.val=p.val;
        node.next=p.next;


    }
}
