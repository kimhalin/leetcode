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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 1);
    }

    public int dfs(TreeNode root, int depth) {
        if (root.left == null && root.right == null)
            return depth;
        
        int depth1 = Integer.MAX_VALUE, depth2 = Integer.MAX_VALUE;
        if (root.left != null)
            depth1 = dfs(root.left, depth + 1);
        if (root.right != null)
            depth2 = dfs(root.right, depth + 1);

        return Math.min(depth1, depth2);
    }
}