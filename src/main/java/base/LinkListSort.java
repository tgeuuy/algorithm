package base;


import org.junit.Test;

public class LinkListSort {
    public class LinkNode {
        int val;
        LinkNode next;

        public LinkNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    @Test
    public void test() {

        LinkNode h = new LinkNode(4);
        LinkNode n1 = new LinkNode(3);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(5);
        LinkNode n4 = new LinkNode(1);
        h.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        LinkNode res = quickSort(h);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }

    }

    private LinkNode quickSort(LinkNode head) {

        if (head == null || head.next == null) return head;

        LinkNode left = new LinkNode(-1);
        LinkNode mid = new LinkNode(-1);
        LinkNode right = new LinkNode(-1);

        LinkNode lTail = left, mTail = mid, rTail = right;
        int v = head.val;

        for (LinkNode node = head; node != null; node = node.next) {
            if (node.val == v) {
                mTail.next = node;
                mTail = node;
            } else if (node.val < v) {
                lTail.next = node;
                lTail = node;
            } else {
                rTail.next = node;
                rTail = node;
            }
        }
        rTail.next = null;
        mTail.next = null;
        lTail.next = null;

        left.next = quickSort(left.next);
        right.next = quickSort(right.next);

        getTail(left).next = mid.next;
        getTail(left).next = right.next;

        LinkNode res = left.next;

        left = null;
        right = null;
        mid = null;

        return res;

    }

    private LinkNode getTail(LinkNode head) {
        while (head.next != null) head = head.next;
        return head;
    }


}
