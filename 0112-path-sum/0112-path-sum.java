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
    private boolean result;
    public void ph(TreeNode node,int targetSum,int sum){
        if(node == null){
            return;
        }

        if(result){
            return ;
        }
        sum = sum + node.val;
        if(node.left == null && node.right ==null){
            if(sum == targetSum){
                result = true;
            }
            return;
        }
        ph(node.left,targetSum,sum);
        ph(node.right,targetSum,sum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        result = false;
        if(root == null)return result;
        ph(root,targetSum,0);
        return result;
    }
}