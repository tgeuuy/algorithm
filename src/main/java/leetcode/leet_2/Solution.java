package leetcode.leet_2;

import structurel.ListNode;
import org.junit.Test;

public class Solution {


    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res,p,q;
        res = new ListNode();
        p=res;
        int flag=0;
        int co=1;
        while (l1!=null&& l2!=null)
        {
           // System.out.println("co="+co++);
            q = new  ListNode();
            int num = l1.val + l2.val;
            q.val=num%10+flag;
            flag = num>=10?1:0;
            p.next=q;
            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            
        }
        return res;
    }
    @Test
    public void save()  {

        ListNode l11 = new ListNode();
        ListNode l21 = new ListNode();
        ListNode l12 = new ListNode();
        ListNode l22 = new ListNode();
        ListNode l13 = new ListNode();
        ListNode l23 = new ListNode();

        l11.val=9;
        l12.val=9;
        l13.val=9;

        l21.val=9;
        l22.val=9;
        l23.val=9;

        l11.next=l12;
        l12.next=l13;
        l13.next=null;

        l21.next=l22;
        l22.next=l23;
        l23.next=null;

         ListNode res = new ListNode();
         res =addTwoNumbers(l11,l21);

         while(res!=null)
         {
             System.out.println(res.val);
             res=res.next;
         }
    }
}
