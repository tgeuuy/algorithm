package leetcode.leet_652;

import structurel.TreeNode;
import org.junit.Test;

import java.util.*;

public class Solution {
    public Map<String, Integer> tree = new HashMap<>();
    public List<TreeNode> res = new ArrayList<>();
    public Map<Integer, Integer> count = new HashMap<>();
    public int t;

    @Test
    public void practice() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        cenxu(root);
        List<TreeNode> res = findDuplicateSubtrees(root);

        cenxu(root);
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        t = 1;
        tree = new HashMap<>();
        res = new ArrayList<>();
        count = new HashMap<>();
        find(root);
        return res;

    }

    public int find(TreeNode root) {
        if (root == null) return 0;

        String str = root.val + " " + find(root.left) + " " + find(root.right);
        int uid = tree.computeIfAbsent(str, x -> t++);
        count.put(uid, count.getOrDefault(uid, 0) + 1);
        if (count.get(uid) == 2) {
            res.add(root);
        }
        return uid;

    }

    private void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }


    }


}
