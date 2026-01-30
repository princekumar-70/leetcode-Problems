
class Solution {
     ArrayList<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
       
        if(root==null) return;
        preorder(root);
       
         for(int i=0;i<list.size()-1;i++){
            TreeNode a = list.get(i);
            TreeNode b = list.get(i+1);
            a.left = null;
            a.right = b;
           }
        
    }
     private void preorder(TreeNode root) {
        if (root == null) return;
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}