package acwing.AC_37;

import structurel.TreeNode;

/**
 * @Author tgeuuy
 * @Date 2021/11/27 9:27
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root1.left = node1;
        root1.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        TreeNode root2 = new TreeNode(3);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(4);

        root2.left = node6;
        root2.right = node7;

        boolean res = hasSubtree(root1, root2);
        System.out.println("res=" + res);

    }

    public static boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {
        boolean res = false;
        if (pRoot1 != null && pRoot2 != null) {
            if (pRoot1.val == pRoot2.val) {
                res = isSame(pRoot1, pRoot2);
            }
            if (!res) {
                res = isSame(pRoot1.left, pRoot2);
            }
            if (!res) {
                res = isSame(pRoot1.right, pRoot2);
            }
        }
        return res;


    }

    private static boolean isSame(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot2 == null) return true;
        if (pRoot1 == null) return false;
        if (pRoot1.val != pRoot2.val) return false;
        return isSame(pRoot1.left, pRoot2.left) && isSame(pRoot1.right, pRoot2.right);
    }


}
