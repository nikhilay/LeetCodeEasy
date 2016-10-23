/**
 * Created by Nikhil on 10/22/16.
 */

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.Ò
 */
public class MinimumDepthOfAtree {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root);
    }

    private int depth(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) {
            return 1;
        }


        int leftResult = depth(root.left);
        int rightResult = depth(root.right);

        if (leftResult == -1) return rightResult + 1;
        if (rightResult == -1) return leftResult + 1;

        return Math.min(leftResult, rightResult) + 1;
    }

}
