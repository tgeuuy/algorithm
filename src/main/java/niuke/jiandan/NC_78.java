package niuke.jiandan;

import structurel.ListNode;
import org.junit.Test;

import java.util.List;

public class NC_78 {


    @Test
    public void practice() {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(3);

        head.next = h1;
        h1.next = h2;
        h2.next = null;
        ListNode res = ReverseList(head);
        ListNode.display(res);

    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode cur = null;
        ListNode next = null;
        while (head!=null)
        {
            next=head.next;
            head.next=cur;
            cur=head;
            head=next;
        }
        return cur;


    }
}
