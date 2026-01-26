
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        InOrder(root ,list);
        return list;

    }
    public void InOrder(TreeNode root , ArrayList<Integer> list){
        if(root==null) return;
        InOrder(root.left,list);
        list.add(root.val);
        InOrder(root.right,list);
    }
}