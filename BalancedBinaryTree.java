public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
        val = x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return determine(root) >= 0 ? true : false;
    }

    private int determine(TreeNode root) {
        if (root == null) {
        return 0;
        } else {
        int leftDepth = determine(root.left);
        int rightDepth = determine(root.right);
        if (leftDepth < 0 || rightDepth < 0 || Math.abs(leftDepth - rightDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}