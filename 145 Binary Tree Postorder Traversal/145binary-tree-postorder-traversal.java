
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        PostOrder(root,list);
        return list;
    }
    public void PostOrder(TreeNode root , ArrayList<Integer> list){
        if(root==null) return;
        PostOrder(root.left,list);
        PostOrder(root.right,list);
        list.add(root.val);

    }
}