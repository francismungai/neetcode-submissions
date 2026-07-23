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
    public int maxDepth(TreeNode root) {
         if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while(!queue.isEmpty()) {
            int levelLen = queue.size();

            for(int i = 0; i < levelLen; i++) {
                TreeNode currentRoot = queue.poll();
                if(currentRoot.right != null) queue.add(currentRoot.right);
                if(currentRoot.left != null) queue.add(currentRoot.left);
            }

            depth++;
        }

        return depth;        
    }
}

/*
add root

pop node
get left and right and add them
get pop 


do I use stack or queue

*/