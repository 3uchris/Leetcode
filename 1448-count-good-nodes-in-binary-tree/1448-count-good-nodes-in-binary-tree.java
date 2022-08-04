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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val);
        return ans;
    }

    int ans = 0;
    void dfs(TreeNode node, int curMax) {
        if (node == null) return;
        if (node.val >= curMax) {
            ans++;
            curMax = node.val;
        }
        dfs(node.left, curMax);
        dfs(node.right, curMax);
    }
}
