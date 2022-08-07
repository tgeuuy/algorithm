package acwing.AC_39;

import structurel.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author tgeuuy
 * @Date 2021/11/29 9:52
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node2.left = node6;

        cenxu(root);


        boolean res = isSymmetric(root);


        System.out.println("res=" + res);


    }

    private static void cenxu(TreeNode root) {
        System.out.println();
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        System.out.println();
    }

    public static boolean isSymmetric(TreeNode root) {
        return root== null || dfs(root.left, root.right);

    }

    private static boolean dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return root1 == null && root2 == null;
        return root1.val == root2.val && dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
    }

}
