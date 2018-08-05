import java.util.*;

public class FlattenBinaryTreetoLinkedListSolution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
        val = x;
        }
    }
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
        TreeNode rightMost = findRightMost(root.left);
        TreeNode rightChild = root.right;
        root.right = root.left;
        root.left = null;
        rightMost.right = rightChild;
        }
        flatten(root.right);
    }
    private TreeNode findRightMost(TreeNode root) {
        if (root == null || root.right == null) return root;
        return findRightMost(root.right);
    }
}