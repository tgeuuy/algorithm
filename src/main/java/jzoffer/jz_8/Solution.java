package jzoffer.jz_8;


import structurel.TreeNode;
import org.junit.Test;

//给定一棵二叉树的其中一个节点，请找出中序遍历序列的下一个节点。
public class Solution {

    /**
     * 分情况讨论即可，如下图所示：
     *
     * 1、如果当前节点有右儿子，则右子树中最左侧的节点就是当前节点的后继。比如F的后继是H；
     * 2、如果当前节点没有右儿子，则需要沿着father域一直向上找，找到第一个是其father左儿子的节点，
     *    该节点的father就是当前节点的后继。比如当前节点是D，则第一个满足是其father左儿子的节点是F，
     *    则C的father就是D的后继，即F是D的后继。
     *       F
     *      / \
     *     C   E
     *    / \ / \
     *   A  D H  G
     *     /    /
     *     B   M
     */
    @Test
    public TreeNode inorderSuccessor(TreeNode p) {
        if (p.right != null) {
            p = p.right;
            while (p.left != null) p = p.left;
            return p;
        }

        while (p.father != null && p == p.father.right) p = p.father;
        return p.father;

    }
}
