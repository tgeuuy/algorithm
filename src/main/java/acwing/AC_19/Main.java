package acwing.AC_19;

import structurel.TreeNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/16 11:07
 * @Version 1.0
 */
public class Main {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode father;
     * TreeNode(int x) { val = x; }
     * }
     */
    public static void main(String[] args) {
        TreeNode root = createBST();
        TreeNode res = inorderSuccessor(root);

    }


    public static TreeNode inorderSuccessor(TreeNode p) {
        if (p.next != null) {
            p = p.right;
            while (p.left != null) p = p.left;
            return p;
        }
        while (p.father != null && p == p.father.right) p = p.father;
        return p.father;


    }


    private static TreeNode createBST() {

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
        return root;
    }


}
