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
    public int sumRootToLeaf(TreeNode root) {
        sum(root, "");
        return res;
    }

    public void sum(TreeNode root, String str) {
        if (root.left == null && root.right == null) {
            res += Integer.parseInt(str + root.val, 2);
            return;
        }
        if (root.left != null)
            sum(root.left, str + root.val);
        if (root.right != null)
            sum(root.right, str + root.val);
    }
}