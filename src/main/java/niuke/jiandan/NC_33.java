package niuke.jiandan;

import structurel.ListNode;

public class NC_33 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list3 = new ListNode(3);
        ListNode list5 = new ListNode(5);
        ListNode list7 = new ListNode(7);


        ListNode list2 = new ListNode(2);
        ListNode list4 = new ListNode(4);
        ListNode list6 = new ListNode(6);
        ListNode list8 = new ListNode(8);


        list1.next = list3;
        list3.next = list5;
        list5.next = list7;

        list2.next = list4;
        list4.next = list6;
        list6.next = list8;

        list7.next = null;
        list8.next = null;


        ListNode res = Merge(list1, list2);

        ListNode.display(res);


        System.out.println("ssss");
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return null;
        if (list2 == null) return null;
        ListNode h = new ListNode(-1);
        ListNode cur = h;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;
        return h.next;


    }
}
