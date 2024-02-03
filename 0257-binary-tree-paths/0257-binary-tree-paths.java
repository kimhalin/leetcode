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
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "" + root.val);
        return list;
    }

    public void dfs(TreeNode root, String str) {
        if (root.left == null && root.right == null) {
            list.add(str);
            return;
        }
        if (root.left != null)
            dfs(root.left, str + "->" + root.left.val);
        if (root.right != null)
            dfs(root.right, str + "->" + root.right.val);
    }
}