package acwing.AC_47;

import structurel.TreeNode;

import java.util.*;

/**
 * @Author tgeuuy
 * @Date 2021/12/2 10:21
 * @Version 1.0
 */
public class Main {


    private static List<List<Integer>> res = new ArrayList<>();
    private static List<Integer> path = new ArrayList<>();


    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(6);
        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(16);
        node1.left = node3;
        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(5);
        TreeNode node9 = new TreeNode(1);
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;


        List<List<Integer>> show = cenxuPlus(root);
        System.out.println(show.toString());


        findPath(root, 22);

        System.out.println(res.toString());


    }

    public static void findPath(TreeNode root, int sum) {
        dfs(root, 0, sum);

    }

    private static void dfs(TreeNode root, int he, int sum) {
        if (root == null) return;
        path.add(root.val);
        he += root.val;

        if (root.left == null && root.right == null && he == sum) {
            List<Integer> tmp = new ArrayList<>(path);
            res.add(tmp);

        } else {
            if (root.left != null) dfs(root.left, he, sum);
            if (root.right != null) dfs(root.right, he, sum);
        }

        path.remove(path.size() - 1);
    }
    private static List<List<Integer>> cenxuPlus(TreeNode root) {

        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> lev = new ArrayList<>();
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
        return res;

    }


}
