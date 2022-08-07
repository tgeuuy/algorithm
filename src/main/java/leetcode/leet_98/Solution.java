package leetcode.leet_98;

import structurel.TreeNode;

public class Solution {


    public static void main(String[] args) {
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

        boolean res = isValidBST(root);
        System.out.println("res=" + res);
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);


    }

    public static boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);


    }
}
