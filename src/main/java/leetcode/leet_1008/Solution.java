package leetcode.leet_1008;

import structurel.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public TreeNode root;

    @Test
    public void test() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = bstFromPreorder(preorder);
        cenxu(root);

    }

    public TreeNode bstFromPreorder(int[] preorder) {
        root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            insert(preorder[i], root);
        }
        return root;
    }

    private void insert(int val, TreeNode root) {
        if (val < root.val) {
            if (root.left == null) root.left = new TreeNode(val);
            else insert(val,root.left);
        }else {
            if (root.right==null) root.right=new TreeNode(val);
            else insert(val,root.right);
        }
    }


    public void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

    }
}
