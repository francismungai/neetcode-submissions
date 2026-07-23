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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode currentRoot = queue.poll();
            
            // Swap the children
            TreeNode left = currentRoot.left;
            TreeNode right = currentRoot.right;
            currentRoot.left = right;
            currentRoot.right = left;
            
            // Add children to the queue if they are not null
            if (currentRoot.left != null) queue.add(currentRoot.left);
            if (currentRoot.right != null) queue.add(currentRoot.right);
        }
        
        return root;
    }
}
