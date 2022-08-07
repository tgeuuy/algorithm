package leetcode.leet_143;

import structurel.ListNode;
import org.junit.Test;


public class Solution {


    public ListNode getMid(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseLinKList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmpNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmpNode;
        }

        return prev;
    }

    public void megerList(ListNode odd, ListNode eve) {
        ListNode odd_tmp;
        ListNode eve_tmp;
        while (odd != null && eve != null) {
            odd_tmp = odd.next;
            eve_tmp = eve.next;
            odd.next = eve;
            odd = odd_tmp;
            eve.next = odd;
            eve = eve_tmp;
        }
        return;
    }

    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode midNode = getMid(head);
        ListNode odd = midNode.next;
        ListNode eve = head;
        midNode.next = null;
        odd = reverseLinKList(odd);

        megerList(eve, odd);


    }

    @Test
    public void practice() {

        ListNode head = new ListNode();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();

        l1.val = 1;
        l2.val = 2;
        l3.val = 3;
        l4.val = 4;
        l5.val = 5;

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        reorderList(head);

        while (head.next != null) {
            System.out.println(head.next.val);
            head = head.next;
        }

    }


}
