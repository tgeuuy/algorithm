package acwing.AC_654;

import structurel.TreeNode;


public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 6, 0, 5};


        TreeNode res = constructMaximumBinaryTree(arr);

        TreeNode.display(res);

    }

    private static TreeNode constructMaximumBinaryTree(int[] arr) {
        return build(arr, 0, arr.length - 1);
    }

    private static TreeNode build(int[] arr, int left, int right) {
        if (left > right) return null;
        int index = left;
        for (int i = left+1; i <= right; i++) {
            if (arr[i] > arr[index]) index = i;
        }
        TreeNode root = new TreeNode(arr[index]);

        root.left = build(arr, left, index - 1);
        root.right = build(arr, index + 1, right);
        return root;
    }

}

