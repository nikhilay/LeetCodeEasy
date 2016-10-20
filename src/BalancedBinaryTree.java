/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined
 * as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int result = checkBalanced(root);
        return result > 0;

    }

    private int checkBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftTreeHeight = checkBalanced(root.left);
        int rightTreeHeight = checkBalanced(root.right);
        if (leftTreeHeight == -1 || rightTreeHeight == -1) {
            return -1;
        }
        if (Math.abs(leftTreeHeight - rightTreeHeight) > 1) {
            return -1;
        } else {
            return Math.max(rightTreeHeight, leftTreeHeight) + 1;
        }
    }
}
