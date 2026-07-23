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
        if (root == null) return true;
        Map<TreeNode, Integer> depthMap = new HashMap<>();

        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode current = root;        
        TreeNode previous = null;

        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            TreeNode top = stack.peek();

            if(top.right != null && top.right != previous){
                current = top.right;
            } else{
                stack.pop();

                int leftDepth = top.left == null ? 0 : depthMap.get(top.left);
                int rightDepth = top.right == null ? 0 : depthMap.get(top.right);

                if(Math.abs(leftDepth - rightDepth) > 1) return false;

                int currentDepth = Math.max(leftDepth, rightDepth) + 1;
                depthMap.put(top, currentDepth);

                previous = top; 
            }
        }

        return true;        
    }
}
