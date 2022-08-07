package leetcode.leet_654;

import structurel.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    @Test
    public void practice() {
        int[] array = new int[]{3, 2, 1, 6, 0, 5};

        TreeNode root = constructMaximumBinaryTree(array);

        cenxu(root);

    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return build(nums, 0, nums.length - 1);

    }

    private TreeNode build(int[] nums, int l, int r) {
        if (l > r) return null;


        int index = -1, max = Integer.MIN_VALUE;

        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = build(nums, l, index - 1);
        root.right = build(nums, index + 1, r);
        return root;
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
