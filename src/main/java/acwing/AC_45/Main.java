package acwing.AC_45;

import structurel.TreeNode;

import java.util.*;

/**
 * @Author tgeuuy
 * @Date 2021/12/1 10:35
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

        List<List<Integer>> res = printFromTopToBottom(root);

        System.out.println(res.toString());

        cenxu(root);
    }


    public static List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Stack<Integer> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int c = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                stack.push(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            } else {
                c++;
                if (!queue.isEmpty()) queue.offer(null);

                if (c % 2 == 1) {
                    List<Integer> level = new ArrayList<>();
                    while (!stack.isEmpty()) level.add(stack.pop());
                    res.add(level);
                    stack = new Stack<>();
                } else {
                    List<Integer> level = new ArrayList<>();
                    Stack<Integer> stack2 = new Stack<>();
                    while (!stack.isEmpty()) stack2.add(stack.pop());
                    while (!stack2.isEmpty()) level.add(stack2.pop());
                    res.add(level);
                    stack.clear();
                    stack2.clear();

                }

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
