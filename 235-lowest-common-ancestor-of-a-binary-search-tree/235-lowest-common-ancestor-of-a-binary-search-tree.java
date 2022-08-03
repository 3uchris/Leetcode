/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while(true){
            if(ancestor.val < p.val && ancestor.val < q.val){
                ancestor = ancestor.right;
            }else if(p.val < ancestor.val && q.val < ancestor.val){
                ancestor = ancestor.left;
            }else{
                break;
            }
        }
        return ancestor;
    }
}
