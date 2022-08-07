package acwing.AC_44;

import structurel.TreeNode;

import java.util.*;

/**
 * @Author tgeuuy
 * @Date 2021/12/1 9:33
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


        cenxu(root);
        List<List<Integer>> res = printFromTopToBottom(root);
        System.out.println(res.toString());

        for (List<Integer> list : res) {
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


    public static List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            } else {
                if (!queue.isEmpty()) queue.offer(null);
                System.out.println(list.toString());
                res.add(list);
                list = new ArrayList<>();
            }
        }
        return res;

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
}
