package niuke.jiandan;

import structurel.ListNode;

public class NC_96 {


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(3);
        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(7);


        ListNode list5 = new ListNode(71);
        ListNode list6 = new ListNode(5);
        ListNode list7 = new ListNode(3);
        ListNode list8 = new ListNode(1);


        list1.next = list2;
        list2.next = list3;
        list3.next = list4;

        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;
        list8.next = null;

        ListNode.display(list1);


//        ListNode tmp = reversal(list1);

//        ListNode.display(tmp);

        boolean res = isPail(list1);

        System.out.println("res=" + res);


    }


    public static ListNode reversal(ListNode head) {
        if (head == null) return null;
        ListNode cur = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = cur;
            cur = head;
            head = next;
        }
        return cur;

    }

    public static boolean isPail(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        if (head.next.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = (fast == null ? slow : slow.next);

        ListNode res = reversal(mid);


        while (res != null) {
            if (res.val != head.val) return false;
            else {
                res = res.next;
                head = head.next;
            }
        }
        return true;
        // write code here
    }
}
