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
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
        return identical(root.left,root.right);


        
    }
    boolean identical(TreeNode root , TreeNode root2){
        if(root==null && root2==null) return true;
        if(root==null|| root2==null) return false;
        if(root.val!=root2.val) return false;
        return identical(root.left,root2.left)&& identical(root.right , root2.right);

    }
    public void invert(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}