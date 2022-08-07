package jzoffer.jz_37;

import structurel.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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

    private String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null) {
                res.append(node.val).append(",");
                q.offer(node.left);
                q.offer(node.right);
            } else {
                res.append("X,");
            }
        }

        return res.toString();
    }

    private TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        TreeNode root = new TreeNode(Integer.parseInt(nodes.poll()));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            String left = nodes.poll();
            String right = nodes.poll();
            if (!"X".equals(left)) {
                node.left = new TreeNode(Integer.parseInt(left));
                q.offer(node.left);
            }
            if (!"X".equals(right)) {
                node.right = new TreeNode(Integer.parseInt(right));
                q.offer(node.right);
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
