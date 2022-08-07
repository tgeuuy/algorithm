package zuochengyun.class06;

public class Code03_SmallerEqualBlgger {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node listPartition1(Node head, int pivot) {
        if (head == null) {
            return head;
        }
        Node cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            cur = cur.next;
        }
        Node[] nodeArr = new Node[i];
        i = 0;
        cur = head;
        for (i = 0; i != nodeArr.length; i++) {
            nodeArr[i] = cur;
            cur = cur.next;
        }
        arrPartition(nodeArr, pivot);

        for (i = 1; i != nodeArr.length; i++) {
            nodeArr[i - 1].next = null;
        }

        nodeArr[i - 1].next = null;
        return nodeArr[0];

    }


    private static void arrPartition(Node[] nodeArr, int pivot) {
        int small = -1;
        int big = nodeArr.length;
        int index = 0;
        while (index != big) {
            if (nodeArr[index].val < pivot) {
                swap(nodeArr, ++small, index++);
            } else if (nodeArr[index].val == pivot) {
                index++;
            } else {
                swap(nodeArr, --big, index);
            }

        }
    }


    private static void swap(Node[] nodeArr, int i, int j) {
        Node tmp;
        tmp = nodeArr[i];
        nodeArr[i] = nodeArr[j];
        nodeArr[j] = tmp;
    }
}

