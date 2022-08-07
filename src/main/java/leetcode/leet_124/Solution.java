package leetcode.leet_124;

import structurel.TreeNode;
import org.junit.Test;

public class Solution {


    public int max = Integer.MAX_VALUE;


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

        int res = maxPathSum(root);
        System.out.println("res=" + res);
    }


    public int maxPathSum(TreeNode root) {


        return oneSideMax(root);

    }

    private int oneSideMax(TreeNode root) {
        if (root == null) return max;
        int maxleft = Math.max(0, oneSideMax(root.left));
        int maxright = Math.max(0, oneSideMax(root.right));
        max = Math.max(max, maxleft + maxright + root.val);
        return Math.max(maxleft,maxright)+root.val;
    }
}
