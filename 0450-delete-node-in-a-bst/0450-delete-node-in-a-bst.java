class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = null;
        TreeNode curr = root; // Fixed: Initialize to root, not null

        // 1. Search for the node to delete and track its parent
        while (curr != null && curr.val != key) { // Fixed: Compare against curr.val
            parent = curr;
            if (key < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        // Key not found in the tree
        if (curr == null) {
            return root;
        }

        // 2. Case 1: Node has NO children (Leaf Node)
        if (curr.left == null && curr.right == null) {
            if (parent == null) {
                return null; 
            }
            if (curr == parent.right) {
                parent.right = null; // Fixed: Use assignment (=) instead of comparison (==)
            } else {
                parent.left = null;
            }
        } 
        // 3. Case 2: Node has ONE child
        else if (curr.left == null || curr.right == null) {
            TreeNode child = (curr.left != null) ? curr.left : curr.right; // Cleaned up logic
            
            if (parent == null) {
                return child; // Fixed: Removed !== syntax error
            }
            if (curr == parent.right) {
                parent.right = child;
            } else {
                parent.left = child;
            }
        } 
        // 4. Case 3: Node has TWO children
        else {
            // Find the inorder successor (smallest node in the right subtree)
            TreeNode successorParent = curr;
            TreeNode successor = curr.right;
            
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left; // Fixed: Completed loop step
            }
            
            // Replace current node's value with the successor's value
            curr.val = successor.val;
            
            // Delete the successor node (it can only have at most a right child)
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }
        }

        return root;
    }
}
