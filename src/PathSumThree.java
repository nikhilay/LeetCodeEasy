/**
 * Created by Nikhil on 12/29/16.
 */


import java.util.HashMap;

/**
 * You are given a binary tree in which each node contains an integer value.
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/64526/17-ms-o-n-java-prefix-sum-method
 */
public class PathSumThree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private int count;

    public int pathSum(TreeNode root, int target) {
        if(root==null) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        pathSum(0,target,root,map);
        return count;
    }
    private void pathSum(int sumTillNow, int target,TreeNode root, HashMap<Integer,Integer> map){
        if(root==null) return;
        //sum - x = target
        //sum - target = x
        sumTillNow +=root.val;
        if(map.containsKey(sumTillNow - target)){
            count += map.get(sumTillNow-target);
        }

        if(!map.containsKey(sumTillNow)){
            map.put(sumTillNow,0);
        }
        map.put(sumTillNow,map.get(sumTillNow)+1);
        pathSum(sumTillNow,target,root.left,map);
        pathSum(sumTillNow,target,root.right,map);
        map.put(sumTillNow,map.get(sumTillNow)-1);
    }
}
