package leetcode.leet_105;

import structurel.TreeNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return insert(preorder, 0, n-1, inorder, 0, n-1);

    }

    private TreeNode insert(int[] preorder, int lpreorder, int rpreorder, int[] inorder, int linorder, int rinorder) {
        if (lpreorder > rpreorder) return null;

        int rootIndex_preorder = lpreorder;   //前序遍历中根节点的位置
        int rootIndex_inorder = map.get(preorder[rootIndex_preorder]); //中序遍历中根节点的位置
        TreeNode root = new TreeNode(preorder[rootIndex_preorder]);

        int leftSize = rootIndex_inorder - linorder; //左子树的长度

        root.left = insert(preorder, rootIndex_preorder+1,rootIndex_preorder+leftSize,inorder,linorder,rootIndex_inorder-1);
        root.right = insert(preorder,rootIndex_preorder+leftSize+1,rpreorder, inorder,rootIndex_inorder+1,rinorder);
        return root;
    }

    public void cenxu(TreeNode root) {
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
