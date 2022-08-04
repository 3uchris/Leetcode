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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // 记录前一个节点
        TreeNode pre = null;
        
        while(stack.size() > 0 || root != null){
            // 一直向左子树走，每一次将当前节点保存到栈中
            if(root != null){
                stack.add(root);
                root = root.left;
            }
            // 当前节点为空，证明走到了最左边，从栈中弹出节点
            // 开始对右子树重复上述过程
            else{
                TreeNode cur = stack.pop();
                // 判断序列是否有序
                if(pre != null && cur.val <= pre.val){
                    return false;
                }
                pre = cur;
                root = cur.right;
            }
        }
        return true;
    }
}
