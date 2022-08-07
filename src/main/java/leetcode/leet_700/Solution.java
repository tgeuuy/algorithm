package leetcode.leet_700;

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

        TreeNode res = searchBST(root,7);
        System.out.println("res="+res.val);


    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        if (val > root.val) {
            return searchBST(root.right, val);
        }
        return null;
    }
}
