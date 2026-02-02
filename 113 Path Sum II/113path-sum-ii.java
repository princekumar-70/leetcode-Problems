
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        DFS(root,arr,ans,targetSum);
        return ans;

        
    }
    public void DFS(TreeNode root , List<Integer> arr , List<List<Integer>> ans, int targetSum){
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null &&root.right==null && targetSum == root.val){
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.addAll(arr);
            ans.add(arr2);

        }
        DFS(root.left, arr,ans,targetSum-root.val);
        DFS(root.right,arr,ans,targetSum-root.val);
        arr.remove(arr.size()-1);
    }
}