/**
 * Created by Nikhil on 10/17/16.
 */


public class SumOfLeftLeaves {
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left ==null && root.right ==null) return 0;

        return sumOfLeftLeavess(root);

    }

    private int sumOfLeftLeavess(TreeNode focusNode){
        if(focusNode ==null) return 0;
        int sum =0;
        if(isleftChild(focusNode.left)){
            sum +=focusNode.left.val;
        }else{
            sum += sumOfLeftLeavess(focusNode.left);
        }
        sum += sumOfLeftLeavess(focusNode.right);
        return sum;
    }

    private boolean isleftChild(TreeNode root){
        if(root==null)return false;
        if(root.left==null&& root.right ==null) return true;
        return false;
    }

}
