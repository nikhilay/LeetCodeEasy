/**
 * Created by Nikhil on 10/22/16.
 */

import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 * root(1)
 * /  \
 * 2  3
 * \
 * 5
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]l
 */
public class BinaryTreesPath {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> finalResults = new LinkedList<>();
        if (root == null) return finalResults;
        LinkedList<LinkedList<String>> list = new LinkedList<>();
        LinkedList<String> curr = new LinkedList();
        treePaths(root,list,curr);
        StringBuilder sb;
        for(LinkedList<String> stringList : list){
            sb = new StringBuilder();
            sb.append(stringList.get(0));
            for(int i =1;i<stringList.size();i++){
                sb.append("->");
                sb.append(stringList.get(i));
            }
            finalResults.add(sb.toString());

        }
        return finalResults;
    }

    private void treePaths(TreeNode focusNode, LinkedList<LinkedList<String>> list, LinkedList<String> curr) {
        curr.add(String.valueOf(focusNode.val));
        if (focusNode.left == null && focusNode.right == null) {
            list.add(curr);
        }

        if(focusNode.left!=null){
            LinkedList<String> temp = new LinkedList(curr);
            treePaths(focusNode.left,list,temp);
        }
        if(focusNode.right!=null){
            LinkedList<String> temp = new LinkedList(curr);
            treePaths(focusNode.right,list,temp);
        }

    }


}
