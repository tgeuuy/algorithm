package leetcode.leet_230;

import structurel.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    ArrayList<Integer> list = new ArrayList<>();

    @Test
    public void practice() {


        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node1.left = node5;
        node1.right = node4;
        node2.right = node3;
        int res = kthSmallest(root, 3);
        System.out.println("res=" + res);


    }


    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        inorder(root);

        if (list.size() < k) return -1;
        return list.get(k - 1);


    }


    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
