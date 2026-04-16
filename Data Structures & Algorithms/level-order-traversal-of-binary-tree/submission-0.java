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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue <TreeNode> pq = new LinkedList<>();

        if(root == null){
            return res;
        }

        pq.add(root);
        while(pq.size() > 0){
        int levelSize = pq.size(); 
    
    // 2. CREATE A BRAND NEW LIST JUST FOR THIS LEVEL (Fixes the clear() trap!)
        List<Integer> temp = new ArrayList<>();

    // 3. ONLY PROCESS EXACTLY 'levelSize' NODES!
    for(int i = 0; i < levelSize; i++) {
        // Now do your exact logic!
        TreeNode cur = pq.poll();
        temp.add(cur.val);

        if(cur.left != null) pq.add(cur.left);
        if(cur.right != null) pq.add(cur.right);
    }

    // 4. ADD THE FINISHED LEVEL TO THE RESULT
    res.add(temp);
        }

        return res;
    }


}
