package acwing.AC_17;

import structurel.ListNode;

import java.util.ArrayList;

/**
 * @Author tgeuuy
 * @Date 2021/11/16 9:43
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode h1 = new ListNode(3);
        ListNode h2 = new ListNode(6);
        ListNode h3 = new ListNode(8);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = null;


        int[] res = printListReversingly(head);


    }

    public static int[] printListReversingly(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> res = new ArrayList<>();
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        int c = 0;
        for (ListNode p = pre; p != null; p = p.next) {
            c++;
            res.add(p.val);
        }
        int[] r = new int[c];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;


    }
}
