package leetcode.leet_701;

import structurel.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


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
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        cenxu(root);
        insertIntoBST(root, 1);
        cenxu(root);
    }

    private void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + "  ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println();
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if(root.val<val) root.right=insertIntoBST(root.right,val);
        if(root.val>val) root.left=insertIntoBST(root.left,val);
        return root;

    }
}
