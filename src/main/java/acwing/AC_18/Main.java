package acwing.AC_18;

import structurel.TreeNode;

import java.util.HashMap;

/**
 * @Author tgeuuy
 * @Date 2021/11/16 10:16
 * @Version 1.0
 */
public class Main {

    /**
     * 给定：
     * 前序遍历是：[3, 9, 20, 15, 7]
     * 中序遍历是：[9, 3, 15, 20, 7]
     * <p>
     * 返回：[3, 9, 20, null, null, 15, 7, null, null, null, null]
     * 返回的二叉树如下所示：
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     *
     * @param args
     */

    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        display(root);
        System.out.println();


    }

    private static void display(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }


//        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, Integer> entry = iterator.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

    }

    private static TreeNode build(int[] preorder, int[] inorder, int pre_l, int pre_r, int in_l, int in_r) {
        if (pre_l > pre_r) return null;


        int pre_root = preorder[pre_l];  //获取根节点的值
        int index_in_root = map.get(pre_root); //获取根节点在中序里的位置

        int left_size = index_in_root - in_l;  //获取左子树的长度

//        System.out.println(pre_root + " " + index_in_root + " " + left_size);
        TreeNode root = new TreeNode(pre_root);


        root.left = build(preorder, inorder, pre_l + 1, pre_l + left_size, in_l, index_in_root - 1);
        root.right = build(preorder, inorder, pre_l + left_size + 1, pre_r, index_in_root + 1, in_r);

        return root;
    }


}
