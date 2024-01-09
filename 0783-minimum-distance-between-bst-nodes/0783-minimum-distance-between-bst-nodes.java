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
    public int minDiffInBST(TreeNode root) {
        int answer = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.left != null)
                q.offer(node.left);

            if (node.right != null)
                q.offer(node.right);
            
            for (int value : list) {
                int diff = Math.abs(node.val - value);
                answer = Math.min(answer, diff);
            }
            list.add(node.val);
        }

        return answer;
    }
}