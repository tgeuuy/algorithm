package linklist.leet_19;

import structurel.ListNode;

public class Solution {



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        head.next = n1;
        n1.next = null;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;



        ListNode.display(head);

        ListNode node = removeNthFromEnd(head, 2);
        ListNode.display(head);
    }



    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;
        ListNode behind = null;
        ListNode front = null;
        behind = head;
        front = head;
        while (--n > 0) {
            front = front.next;

        }
        while (front.next != null) {
            front = front.next;
            behind = behind.next;
        }
//        System.out.println(front.val + "ddd");
//        System.out.println(behind.val + "aaa");
        if (behind.next.next == null) {
            return front.next;
        }
        if (behind.next.next == null) {
            behind.next = null;
        } else {
            behind.next = behind.next.next;
        }

        return head;
    }


}
