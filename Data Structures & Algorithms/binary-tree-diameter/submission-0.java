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
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);

        return diameter;
        
    }

    private int depth(TreeNode root) {
        if(root == null) return 0;

        int depthLeft = depth(root.left);
        int depthRight = depth(root.right);

        diameter = Math.max(diameter, depthLeft + depthRight);

        return Math.max(depthLeft, depthRight) + 1;        
    }
}
