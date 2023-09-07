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
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> list = new ArrayList();
        List<Double> res = new ArrayList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while(size-- > 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (size == 0) {
                    Long sum = list.stream().mapToLong(Long::valueOf).sum();
                    int divider = (list.size() != 0) ? list.size() : 1;     
                    res.add(sum / (double) divider);
                    list.clear();
                }

                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
            }
        }
        return res;

    }
}