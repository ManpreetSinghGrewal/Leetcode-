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
    static boolean res = false;

    public boolean helper(TreeNode node, int n) {
        if (node == null) {
            return true;
        }
        if (node.val != n)
            return false;
        return helper(node.left, n) && helper(node.right, n);
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        int n = root.val;
        return helper(root, n);
    }
}