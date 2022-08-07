package leetcode.leet_100;

import structurel.TreeNode;

public class Solution {


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);

        root1.left = node1;
        root1.right = node2;

        root2.left = node3;
        root2.right = node4;

        boolean res = isSameTree(root1, root2);
        System.out.println("res=" + res);





    }

    private static boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);

    }
}
