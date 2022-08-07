package leetcode.leet_95;

import structurel.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {


    @Test
    public void practice() {
        List<TreeNode> res = generateTrees(5);
        for (TreeNode node : res) {
            cenxu(node);
            System.out.println();
        }
    }

    private void cenxu(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            System.out.print(node.val + " ");
            if (node.left != null) deque.offer(node.left);
            if (node.right != null) deque.offer(node.right);

        }
    }


    public List<TreeNode> generateTrees(int n) {


        if (n == 0) return new ArrayList<>();

        return build(1, n);
    }

    private List<TreeNode> build(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }

        for (int i = l; i <= r; i++) {
            List<TreeNode> leftTree = build(l, i - 1);
            List<TreeNode> rightTree = build(i + 1, r);
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);

                }
            }
        }

        return res;
    }
}
