package leetcode.leet_222;

import structurel.TreeNode;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);

        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
//        node1.right = node4;
//        node2.left = node5;

        cenxu(root);
        int res = countNodes(root);
        System.out.println("res = " + res);


    }

    private static void cenxu(TreeNode root) {
        System.out.println();
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        System.out.println();
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int h = 0;
        TreeNode tree = root;
        while (tree.left != null) {
            tree = tree.left;
            h++;
        }


        int left = 1 << h;
        int right = (1 << (h + 1)) - 1;
        int i = left;
        System.out.println("h=" + h);
        System.out.println("left=" + left);
        System.out.println("right=" + right);
        for (; i <= right; i++) {
            StringBuilder sb = new StringBuilder();
            int ccc = i;
            while (ccc > 0) {
                sb.append(ccc % 2);
                ccc /= 2;
            }
//            System.out.println(sb.reverse());
            if (!check(root, sb.reverse())) break;

        }
        return i;

    }

    private static boolean check(TreeNode root, StringBuilder sb) {
        TreeNode node = root;
        System.out.println(sb);
        for (int i = 1; i < sb.length(); i++) {

//                System.out.println(sb.charAt(i) + "aa");
            System.out.println(node.val);
            if (sb.charAt(i) == '1' && node.right != null) node = node.right;
            if (sb.charAt(i) == '0' && node.left != null) node = node.left;

        }
        return true;
    }


}
