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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
         if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            int maxVal = Integer.MIN_VALUE; // Track the maximum value for this level
            
            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = q.poll();
                maxVal = Math.max(maxVal, currentNode.val);
                
                // Add child nodes to the queue for the next level
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
             result.add(maxVal);
        }
        return result;
    }
}