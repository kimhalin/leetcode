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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                TreeNode node = q.poll();
                sum+= node.val;

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);

            }
            list.add((sum * 1.0) / n);            
        }

        return list;
    }
}