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
    private static final int UNBALANCED = -1;

    public boolean isBalanced(TreeNode root) {
        return helper(root) != UNBALANCED;
    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;

        //如果左子节点不是平衡二叉树，直接返回UNBALANCED
        int left = helper(root.left);
        if (left == UNBALANCED)
            return UNBALANCED;

        //如果右子节点不是平衡二叉树，直接返回UNBALANCED
        int right = helper(root.right);
        if (right == UNBALANCED)
            return UNBALANCED;

        //如果左右子节点都是平衡二叉树，但他们的高度相差大于1，
        //直接返回UNBALANCED
        if (Math.abs(left - right) > 1)
            return UNBALANCED;

        //否则就返回二叉树中节点的最大高度
        return Math.max(left, right) + 1;
    }
}
