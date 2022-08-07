package leetcode.leet_110;


import structurel.TreeNode;
import util.TreeUtil;
import org.junit.Test;

public class Solution {
    public int getheight(TreeNode root) {
        if (root == null) return 0;
        int left_h = getheight(root.left);
        int right_h = getheight(root.right);

        return (left_h > right_h) ? (1 + left_h) : (right_h + 1);
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getheight(root.right) - getheight(root.left)) <= 1 && isBalanced(root.left) && isBalanced(root.right);


    }

    @Test
    public void practice() {
        Integer[] arr = {1, null, 2, null, 3};
        TreeNode head = TreeUtil.createTree(arr);
        TreeUtil.display(head);
        boolean res = isBalanced(head);
        System.out.println();
        System.out.println("res=" + res);
    }

}
