/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given a binary tree and a sum, determine
 * if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */
public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return hasPath(root, sum);
    }

    private boolean hasPath(TreeNode root, int sum) {

        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && (sum - root.val) == 0) {
            return true;
        }


        boolean leftSum = hasPath(root.left, sum - root.val);
        boolean rightSum = hasPath(root.right, sum - root.val);

        return leftSum || rightSum;
    }
}
