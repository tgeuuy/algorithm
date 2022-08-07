package acwing.AC_70;

import structurel.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    static int a = 0;
    static TreeNode res = new TreeNode();

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

        cenxu(root);

        TreeNode aa = kthNode(root, 3);
        System.out.println(aa.val);

    }

    public static TreeNode kthNode(TreeNode root, int k) {
        a = k;
        dfs(root);
        return res;
    }

    private static void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        a--;
        if (a == 0) {
            res = root;
        }
        dfs(root.right);
    }

    private static void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        System.out.println();


    }
}
