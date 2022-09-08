package bishi.meituan;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ti_5 {

    static class LinkNode {
        int val;
        LinkNode next;

        public LinkNode(int v) {
            this.val = v;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        LinkNode h = new LinkNode(-1);
        LinkNode tail = h;
        for (int i = 1; i <= n; i++) {
            LinkNode node = new LinkNode(i);
            tail.next = node;
            tail = node;
        }
        tail.next = null;

        while (t-- > 0) {
            int w = sc.nextInt();
            LinkNode pre = h;
            LinkNode node = h.next;
            while (node!= null && node.val != w){
                pre = pre.next;
                node = node.next;
            }
            pre.next = node.next;
            node.next = h.next;
            h.next = node;
        }
        for (LinkNode node = h.next; node != null; node = node.next) {
            System.out.print(node.val + " ");
        }


    }
}

