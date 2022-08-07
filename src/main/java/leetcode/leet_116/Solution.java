package leetcode.leet_116;

import structurel.Node;
import structurel.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {


    @Test
    public void practice() {

        Node root = new Node(5);
        Node node1 = new Node(3);
        Node node2 = new Node(6);

        Node node3 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(7);

        root.left = node1;
        root.right = node2;

        node1.left = node5;
        node1.right = node4;
        node2.right = node3;

        cenxu(root);
        connect(root);

        cenxu(root);

    }

    public Node connect(Node root) {
        if (root == null) return root;
        cenxuTwoNode(root.left, root.right);
        return root;

    }

    private void cenxuTwoNode(Node left, Node right) {
        if (left == null || right == null) return;
        left.next = right;
        cenxuTwoNode(left.left,left.right);
        cenxuTwoNode(right.left,right.right);
        cenxuTwoNode(left.right,right.left);
    }

    private void cenxu(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println();


    }
}
