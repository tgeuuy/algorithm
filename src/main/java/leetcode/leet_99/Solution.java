package leetcode.leet_99;

import structurel.TreeNode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public TreeNode s = new TreeNode(), t = new TreeNode(), prev = new TreeNode();

    @Test
    public void practice() {


        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node1.left = node5;
        node1.right = node4;
        node2.right = node3;
        recoverTree(root);

        cenxu(root);

    }

    private void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }


    }

    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode x = null, y = null, pred = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) {
                    x = pred;
                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
