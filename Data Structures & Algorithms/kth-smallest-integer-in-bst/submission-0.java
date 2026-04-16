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
    public int kthSmallest(TreeNode root, int k) {
        int visited = 0;
        Stack <TreeNode> t = new Stack();
        TreeNode cur = root;
        

        while(cur != null || !t.isEmpty()){
            while(cur != null){
                t.push(cur);
                cur = cur.left;
            }
            cur = t.pop();
            visited++;
            if(visited == k){
                return cur.val;
            }
            cur = cur.right;
        }

        return -1;
    }
}
