package structurel;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode father;
    public TreeNode next;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val, TreeNode father) {
        this.val = val;
        this.father = father;
    }

    public TreeNode(int val, TreeNode left, TreeNode right, TreeNode father, TreeNode next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.father = father;
        this.next = next;
    }
}
