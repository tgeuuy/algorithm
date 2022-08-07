package niuke.jiandan;

import structurel.TreeNode;

import java.net.Inet4Address;
import java.util.*;

public class NC_14 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;

        ArrayList<ArrayList<Integer>> res = Print(root);
        ArrayList<Integer> res1 = cenxun(root);
        for (int v : res1) {
            System.out.print(v + " ");
        }
        ArrayList<ArrayList<Integer>> res2=cenxun1(root);
        System.out.println(res2);

    }

    private static ArrayList<Integer> cenxun(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return res;
    }

    private static ArrayList<ArrayList<Integer>> cenxun1(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node = new TreeNode(-1);
        queue.offer(node);
        List<Integer> a = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.val == -1) {
                if (a.isEmpty()) {
                    break;
                }
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(a);
                res.add(temp);
                a.clear();
                queue.offer(node);
                continue;
            }
            a.add(tmp.val);
            if (tmp.left != null) queue.offer(tmp.left);
            if (tmp.right != null) queue.offer(tmp.right);
        }
        return res;

    }


    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) return null;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        stack1.push(pRoot);
        while (stack1 != null) {
            TreeNode node = stack1.pop();

        }
        return res;

    }
}
