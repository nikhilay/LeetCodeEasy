/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 * Note:
 * Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest to the target.
 */
public class ClosestBinarySearchTreeValue {
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

    private int ans = Integer.MAX_VALUE;
    private double min = Integer.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        findClosestValue(root, target);
        return ans;

    }

    private void findClosestValue(TreeNode root, double target) {
        if (root == null) {
            return;
        }

        double diff = Math.abs(target - (double) root.val);
        if (diff < min) {
            min = diff;
            ans = root.val;

        }

        if (target > root.val) {
            findClosestValue(root.right, target);
        } else {
            findClosestValue(root.left, target);
        }
        return;
    }


}
