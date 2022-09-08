package niuke.jiandan;

import structurel.ListNode;

public class BM_2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(5);
        ListNode h5 = new ListNode(6);
        ListNode h6 = new ListNode(7);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;
        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();

        ListNode res = reverseBetween(head, 2, 4);
//        ListNode res = reverse(head);
        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
//        }


        }
    }


    public static ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        int l = 1;
        ListNode pre = head;
        while (l < m - 1) {
            pre = pre.next;
            l++;
        }
        ListNode cur = pre.next;
        ListNode next = null;
        ListNode ff = pre;
        ListNode last = ff.next;

        while (l < n && cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            l++;
        }
        if (ff.next != null) ff.next = pre;

        if (last != null && last.next != null) last.next = cur;


        return head;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }

}
