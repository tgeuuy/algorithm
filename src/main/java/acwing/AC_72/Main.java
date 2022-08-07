package acwing.AC_72;

import structurel.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author tgeuuy
 * @Date 2021/12/20 10:42
 * @Version 1.0
 */
public class Main {

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

        List<List<Integer>> res = cenxu_Plau(root);
        System.out.println(res.toString());

        boolean res1 = isBalanced(root);
        System.out.println("res=" + res1);


    }

    private static List<List<Integer>> cenxu_Plau(TreeNode root) {
        List<Integer> lev = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                if (!q.isEmpty()) q.offer(null);
                res.add(lev);
                lev = new ArrayList<>();
            } else {
                lev.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

        }
        return res;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = get_height(root.left);
        int r = get_height(root.right);
        boolean res = Math.abs(l - r) <= 1;
        return res && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int get_height(TreeNode root) {
        if (root == null) return 0;
        int l = get_height(root.left);
        int r = get_height(root.right);
        return Math.max(l, r) + 1;
    }
}
