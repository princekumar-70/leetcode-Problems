
class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max =0;
        levels(root);
       
        return max;
        
    }
    private int levels(TreeNode root){
        if(root==null) return 0;
        int levelsLeft = levels(root.left);
        int levelsRight = levels(root.right);
        max = Math.max(max,levelsLeft+levelsRight);
        return 1+Math.max(levelsLeft,levelsRight);
    }
}