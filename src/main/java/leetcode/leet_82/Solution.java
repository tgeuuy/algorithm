package leetcode.leet_82;


import structurel.ListNode;

//       输入：head = [1,2,3,3,4,4,5]
//        输出：[1,2,5]
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();
        head.val = 1;
        head.next = l1;
        l1.val = 2;
        l1.next = l2;
        l2.val = 3;
        l2.next = l3;
        l3.val = 3;
        l3.next = l4;
        l4.val = 4;
        l4.next = l5;
        l5.val = 4;
        l5.next = l6;
        l6.val = 5;
        l6.next = null;

        display(head);
        ListNode res = deleteDuplicates(head);
        display(res);


    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        dummy.val = 0;

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;

    }

    public static void display(ListNode head) {
        if (head == null) return;
//        ListNode p=head.next;
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
}
