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
        if(root == null)return true;
        Stack<TreeNode> st = new Stack<>();
        long prevValue = Long.MIN_VALUE; 
        TreeNode curr = root;
        while(curr !=null|| !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            if(curr.val <= prevValue){
                return false;
            }
            prevValue = curr.val;
            curr = curr.right;
        }
        return true;
    }
}