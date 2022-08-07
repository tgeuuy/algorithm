package linklist.leet_234;

import structurel.ListNode;
import util.LinkListUtil;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            if (list.get(i).equals(list.get(j))) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Test
    public void practice() {
        LinkListUtil listUtil = new LinkListUtil();

        int[] array = {-12, -12};
        ListNode head = listUtil.creat(array);
        listUtil.display(head);
        boolean res = isPalindrome(head);
        System.out.println("res=" + res);
        return;
    }
}
