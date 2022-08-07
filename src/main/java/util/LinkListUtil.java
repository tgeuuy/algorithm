package util;


import structurel.ListNode;

public final  class LinkListUtil extends ListNode {
    public static ListNode creat(int[] array) {
        ListNode head = new ListNode();
        head.next = null;
        ListNode r = null;
        for (int i = 0; i < array.length; i++) {
            r = new ListNode();
            r.val = array[i];
            r.next = head;
            head = r;
        }
        r.next = null;

        return head;
    }


    public static  void display(ListNode head) {
        if (head == null) {
            System.out.println("链表为空！");
            return;
        }
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
        System.out.println();
    }
}
