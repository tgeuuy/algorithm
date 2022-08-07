package acwing.AC_29;

import structurel.ListNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/23 9:37
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
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

        ListNode res = deleteDuplication(head1);
        for (ListNode p = res; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }
        System.out.println();


    }

//    public static ListNode deleteDuplication(ListNode head) {
//        int[] c = new int[105];
//        for (ListNode p = head; p != null; p = p.next) {
//
//            c[p.val]++;
//        }
//        ListNode h = new ListNode();
////        ListNode s = new ListNode();
//        ListNode r = new ListNode();
//        r = h;
//        for (ListNode p = head; p != null; p = p.next) {
//            if (c[p.val] >= 2) continue;
//            else {
//                ListNode node = new ListNode(p.val);
//                r.next = node;
//                r = node;
//            }
//        }
//        r.next = null;
//        return h.next;
//
//    }

    public static ListNode deleteDuplication(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null) {
            ListNode q = p.next;
            while (q != null && p.next.val == q.val) q = q.next;
            if (p.next.next == q) p = p.next;
            else p.next = q;
        }
        return dummy.next;

    }
}
