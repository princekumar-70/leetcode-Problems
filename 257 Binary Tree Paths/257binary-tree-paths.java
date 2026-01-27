
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> sb = new ArrayList<>();
        if(root==null)return sb;
        BinaryPath(root,"",sb);
        return sb;

       
        
    }
     void BinaryPath(TreeNode root ,String path, List<String> sb){
        if(root==null) return;
         path+=root.val;
      
       if(root.left==null && root.right==null){
        sb.add(path);
        return;
       }
       path+="->";
      
       BinaryPath(root.left ,path, sb);
       BinaryPath(root.right,path,sb);
    }
}