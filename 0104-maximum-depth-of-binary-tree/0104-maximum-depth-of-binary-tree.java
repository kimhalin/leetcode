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
    int res = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return find(root, 0);
    }

    public int find(TreeNode root, int val) {
        if (root == null) return Math.max(res, val);

        return Math.max(find(root.left, val + 1), find(root.right, val + 1));
    }
}