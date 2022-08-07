package niuke.jiandan;

import structurel.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NC_70 {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(6);
        ListNode n8 = new ListNode(8);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;
        ListNode.display(n1);


        ListNode res = sort(n1);

        ListNode.display(res);
    }

    private static ListNode sort(ListNode head) {
        if (head == null || head.next == null) return head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        Collections.sort(arrayList);
        for (int v :  arrayList) {
            System.out.println(v+"    ");
        }


        int[] nums = new int[arrayList.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= arrayList.get(i);
        }
        Arrays.sort(nums);

        ListNode res = new ListNode(-1);
        ListNode h = res;
        for (int v : nums) {
            ListNode n = new ListNode(v);
            h.next = n;
            h = h.next;
        }

        return res.next;


    }
}
