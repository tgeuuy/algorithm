package leetcode.leet_101;

import structurel.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 20:01
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        cenxuplus(root);
        boolean res = isSymmetric(root);
        System.out.println("res=" + res);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root.left, root.right);


    }

    private static boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == null && right == null;
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }

    private static void cenxuplus(TreeNode root) {
        System.out.println();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lev = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        if (root == null) return;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (!queue.isEmpty()) queue.offer(null);
                res.add(lev);
                lev = new ArrayList<>();
            } else {
                lev.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

        }
        System.out.println(res.toString());
        System.out.println();
    }
}
