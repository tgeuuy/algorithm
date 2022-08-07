package leetcode.leet_297;

import structurel.TreeNode;
import org.junit.Test;

import java.util.*;

public class Codec {


    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        String s = serialize(root);
        System.out.println(s);
        TreeNode node = deserialize(s);


        display(node);

    }


    public String serialize(TreeNode root) {

        if (root == null) return "";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                res.append("X,");
            } else {
                res.append(node.val).append(",");
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return res.toString();

    }


    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;

//        for(String s:data.split(",")) System.out.print(s+" ");
//        System.out.println(Arrays.asList(data.split(",")));
        Queue<String> nodes = new ArrayDeque<>(Arrays.asList(data.split(",")));
        TreeNode root = new TreeNode(Integer.parseInt(nodes.poll()));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            String left = nodes.poll();
            String right = nodes.poll();
            if (!left.equals("X")) {
                node.left = new TreeNode(Integer.parseInt(left));
                queue.add(node.left);
            }
            if (!right.equals("X")) {
                node.right = new TreeNode(Integer.parseInt(right));
                queue.add(node.right);
            }
        }
        return root;

    }


    public void display(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
    }
}
