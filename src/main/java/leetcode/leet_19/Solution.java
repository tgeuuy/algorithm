package leetcode.leet_19;


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


        display(head1);
        ListNode res = removeNthFromEnd(head1, 3);
        display(res);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode du = new ListNode(0, head);//加上头指针
        ListNode frist = head;
        ListNode slow = du;
        for (int i = 0; i < n; i++) frist = frist.next;
        while (frist != null) {
            frist = frist.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return du.next;
    }

    public static void display(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) System.out.print(p.val + " ");
        System.out.println();
    }
}
