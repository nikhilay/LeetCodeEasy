import javax.swing.tree.TreeNode;

/**
 * Created by Nikhil on 10/17/16.
 */
public class MaximumDepthOfaTree {

    // Definition for a binary tree node.
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            int leftsum = maxDepth(root.left) + 1;
            int rightsum = maxDepth(root.right) + 1;
            return Math.max(leftsum, rightsum);


        }
    }
}
