

public class LowestCommonAncestorBSTSolution {
    class TreeNode {
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int x) {
            value = x;
        }
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.value == root.value || q.value == root.value) return root;

        else if ((p.value < root.value && q.value > root.value) || (q.value < root.value && p.value > root.value))
            return root;

        else if (p.value < root.value && q.value < root.value)
            return lowestCommonAncestor(root.leftNode, p, q);

        else
            return lowestCommonAncestor(root.rightNode, p, q);
    }
}