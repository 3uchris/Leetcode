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
    int longest = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return longest;
    }
    
    public int longestPath(TreeNode root){
        if(root == null) return 0;
        
        int leftheight = longestPath(root.left);
        int rightheight = longestPath(root.right);
        
        longest = Math.max(longest, leftheight+rightheight);
        
        return Math.max(leftheight, rightheight)+1;
    }
    
    
}