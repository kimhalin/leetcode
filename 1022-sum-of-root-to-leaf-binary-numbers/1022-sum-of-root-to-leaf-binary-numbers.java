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
    int ans = 0;
    void trav(TreeNode root,int val){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            ans += val*2 + root.val;
        trav(root.left,val*2+root.val);
        trav(root.right,val*2+root.val);   
    }
    public int sumRootToLeaf(TreeNode root) {
         trav(root,0);
        return ans;
    }
}