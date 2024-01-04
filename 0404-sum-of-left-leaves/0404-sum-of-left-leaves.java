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
    public int sumOfLeftLeaves(TreeNode root) {
        int answer = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.right != null) {
                q.offer(node.right);
            }
            if (node.left != null) {
                if (node.left.right == null && node.left.left == null)
                    answer += node.left.val;
                else
                    q.offer(node.left);
            }
        }

        return answer;
    }
}