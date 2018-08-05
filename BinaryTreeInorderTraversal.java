import java.util.*;

public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
        val = x;
        }
    }
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inOrder = new ArrayList<Integer>();
        if (root == null) return inOrder;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(root);
        TreeNode p = root.left;
        while (!s.empty()) {
        while (p != null) {
            s.add(p);
            p = p.left;
        }
        TreeNode n = s.pop();
        inOrder.add(n.val);
        p = n.right;
        if (p != null) {
            s.add(p);
            p = p.left;
        }
        }
        return inOrder;
    }
}