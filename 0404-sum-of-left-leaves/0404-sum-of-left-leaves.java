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
    public int sumOfLeftLeaves(TreeNode root) {
        // 왼쪽 서브트리에 있는 왼쪽 노드 모두 구하기
        // 오른쪽 서브 트리에 있는 왼쪽 노드 모두 구하기
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                res += root.left.val;
            else
                sumOfLeftLeaves(root.left);
        }

        if (root.right != null) sumOfLeftLeaves(root.right);
        return res;
    }
}