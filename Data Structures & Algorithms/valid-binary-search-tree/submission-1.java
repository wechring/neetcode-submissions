/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;


        return isValidBSTRange(min, max, root);

    }

    public boolean isValidBSTRange(int min, int max, TreeNode root) {

        if(root == null){
            return true;
        }
        if(root.val >= max || root.val <= min){
            return false;
        } 

        return isValidBSTRange(root.val, max, root.right) && isValidBSTRange(min, root.val, root.left);
        
    }

}
