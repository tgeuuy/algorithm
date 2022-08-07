package acwing.AC_1451;

import structurel.ListNode;

/**
 * @Author tgeuuy
 * @Date 2021/10/28 10:03
 * @Version 1.0
 */
public class  Main {


    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);


        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();

        ListNode root = quickSortList(head);

        for (ListNode p = root; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
    }


    public static ListNode quickSortList(ListNode head) {

        if (head == null || head.next == null) return head;


        ListNode left = new ListNode(-1);
        ListNode mid = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode ltail = left, rtail = right, mtail = mid;
        int val = head.val;
        for (ListNode p = head; p != null; p = p.next) {
            if (p.val < val) ltail = ltail.next = p;
            else if (p.val == val) mtail = mtail.next = p;
            else rtail = rtail.next = p;
        }
        ltail.next = mtail.next = rtail.next = null;
        left.next = quickSortList(left.next);
        right.next = quickSortList(right.next);

        get_tail(left).next = mid.next;
        get_tail(left).next = right.next;

        return left.next;
    }

    private static ListNode get_tail(ListNode head) {
        while (head.next != null) head = head.next;
        return head;
    }

}
