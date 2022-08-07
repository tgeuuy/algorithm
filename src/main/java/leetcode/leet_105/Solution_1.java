package leetcode.leet_105;

import structurel.TreeNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution_1 {

    /**
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     */


    public HashMap<Integer, Integer> map = new HashMap<>();


    @Test
    public void test() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        cenxu(root);

    }


    private TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        System.out.println(map.toString());
        TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode build(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr) return null;

        int root = preorder[pl];
//        System.out.println("root=" + root);
        TreeNode node = new TreeNode(root);
        int iroot_index = map.get(root);
        System.out.println("root=" + root + "  " + "iroot_index=" + iroot_index);
        int left_size = iroot_index - il;
        node.left = build(preorder, pl + 1, pl + left_size, inorder, il, il + left_size);
        node.right = build(preorder, pl + 1 + left_size, pr, inorder, iroot_index + 1, ir);
        return node;
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
