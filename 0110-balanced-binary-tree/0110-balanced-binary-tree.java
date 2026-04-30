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
    public boolean isBalanced(TreeNode root) {
        return solve(root)==-1?false:true;
        
    }
    public int solve(TreeNode root){
        if(root == null)return 0;
        int left_height = solve(root.left);
        int right_height = solve(root.right);
        if(left_height==-1 || right_height ==-1)return -1;
        if( Math.abs(left_height - right_height) > 1)return -1;
        return 1+Math.max(left_height,right_height);
    }
}