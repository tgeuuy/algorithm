package acwing.AC_49;

import structurel.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author tgeuuy
 * @Date 2021/12/6 9:52
 * @Version 1.0
 */
public class Main {

    public static TreeNode first = null;
    public static TreeNode last = null;


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

        List<List<Integer>> res = cenxuPlus(root);

        System.out.println(res.toString());

        convert(root);

        for (TreeNode node = root; node != null; node = node.right) {
            System.out.print(node.val + " ");
        }


    }


    public static void convert(TreeNode root) {
        dfs(root);
    }

    private static void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (last == null) {
            first = node;
        } else {
            last.right = node;
            node.left = last;
        }
        last = node;
        dfs(node.right);
    }

    public static List<List<Integer>> cenxuPlus(TreeNode root) {
        System.out.println();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lev = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
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
        System.out.println();
        return res;
    }
}
