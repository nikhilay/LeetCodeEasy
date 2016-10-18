/**
 * Created by Nikhil on 10/17/16.
 */
public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.right = left;
        root.left = right;
        return root;

    }
}
