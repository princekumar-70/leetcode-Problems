
class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        Inorder(root , arr);
        Collections.reverse(arr);
        int sum =0;
        for(int i=0;i<arr.size();i++){
            int app = arr.get(i).val;
            
            sum += app;
            arr.get(i).val = sum;


        }
        return root;

        
    }
    public void Inorder(TreeNode root , ArrayList<TreeNode> arr){
        if(root==null)return;
        Inorder(root.left , arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
}