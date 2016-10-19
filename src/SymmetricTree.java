/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class SymmetricTree {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        if (!isEqual(node1.right, node2.left) || !isEqual(node1.left, node2.right)) return false;

        return true;


    }
}
