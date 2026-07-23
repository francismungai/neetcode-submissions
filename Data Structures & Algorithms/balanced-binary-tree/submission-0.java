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
        return depth(root) != -1;
        
    }

    private int depth(TreeNode root) {
        if(root == null) return 0;

        int depthLeft = depth(root.left);
        if(depthLeft == -1) return -1;

        int depthRight = depth(root.right);
        if(depthRight == -1) return -1;

        if(Math.abs(depthLeft - depthRight) > 1) return -1;

        return Math.max(depthLeft, depthRight) + 1;
    }
}
