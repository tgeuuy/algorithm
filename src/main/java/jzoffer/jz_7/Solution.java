package jzoffer.jz_7;

import structurel.TreeNode;
import org.junit.Test;

import java.util.HashMap;

public class Solution {
    public HashMap<Integer, Integer> map = new HashMap<>();

    @Test
    public void test() {
        TreeNode root = null;
        int[] preorder = new int[]{10, 6, 4, 8, 14, 12, 16};

        int[] inorder = new int[]{4, 6, 8, 10, 12, 14, 16};
        root = buildTree(preorder, inorder);

        preprint(root);

    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) map.put(inorder[i], i);
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);


    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if (pl > pr) return null;
        //根节点的位置
        int pRoot = pl; // 在前序遍历中
        int iRoot = map.get(preorder[pRoot]);  //在中序遍历中
        TreeNode root = new TreeNode(preorder[pRoot]);


        //左子树的大小
        int size_left = iRoot - il;

        root.left = myBuildTree(preorder, inorder, pRoot + 1, pRoot + size_left, il, iRoot - 1);
        root.right = myBuildTree(preorder, inorder, pRoot + size_left + 1, pr, iRoot + 1, ir);
        return root;
    }

    private void preprint(TreeNode root) {
        if (root == null) return;
        else {
            System.out.print(root.val+" ");
            preprint(root.left);
            preprint(root.right);

        }
    }
}
