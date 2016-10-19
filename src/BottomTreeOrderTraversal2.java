import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
public class BottomTreeOrderTraversal2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList();
        TreeMap<Integer, LinkedList<Integer>> hmap = new TreeMap();
        levelOrderBottom(root, 0, hmap);

        for(Integer i:hmap.descendingKeySet()){
            result.add(hmap.get(i));
        }

        return result;

    }

    private void levelOrderBottom(TreeNode root, int depth, TreeMap<Integer, LinkedList<Integer>> hmap) {
        if (root == null) {
            return;
        }
        if (hmap.containsKey(depth)) {
            hmap.get(depth).add(root.val);
        }else{
            LinkedList<Integer> values = new LinkedList<Integer>();
            values.add(root.val);
            hmap.put(depth,values);
        }
        levelOrderBottom(root.left,depth+1,hmap);
        levelOrderBottom(root.right,depth+1,hmap);
        return;
    }
}
