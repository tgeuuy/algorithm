package niuke.jiandan;

import structurel.ListNode;
import org.junit.Test;

public class NC_4 {

    @Test
    public void practice() {
        ListNode head = new ListNode(0);
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h2;
        h4.next = h5;
        h5.next = h1;


        Boolean res = hasCycle(head);
        System.out.println("res=" + res);


    }

    private Boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode h1 = head;
        ListNode h2 = head;
        int co = 1;
        while ((h2.next != null) && (h2 != null)) {
            co++;
            h1 = h1.next;
            h2 = h2.next.next;
            if (h1 == h2) {
                System.out.println("co=" + co);
                return true;
            }


        }

        return false;

    }


}
