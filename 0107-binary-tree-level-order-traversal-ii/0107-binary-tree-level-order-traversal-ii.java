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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>>res = new ArrayList<>();
        if (root == null) return res; 
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode l = q.remove();
                ans.add(l.val);
                if(l.left!=null){
                    q.add(l.left);
                }
                if(l.right!=null){
                    q.add(l.right);
                }
            }
            res.add(0,ans);
        }
        return res;

    }
}