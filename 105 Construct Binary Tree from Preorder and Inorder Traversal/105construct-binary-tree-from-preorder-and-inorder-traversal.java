
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return Build(0,n-1,0,n-1,preorder , inorder);
    }
    public TreeNode Build(int prelo,int prehi,int inLo, int inHi,int[] preorder, int[] inorder){
        if(prelo>prehi || inLo>inHi) return null;
        int val = preorder[prelo];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i =inLo;i<=inHi;i++){
            if(inorder[i]==val){// locating
                r=i;
                break;
            }


        }
        int cnt = r-inLo;
        root.left = Build(prelo+1,prelo+cnt,inLo,r-1,preorder , inorder );
        root.right = Build(prelo+cnt+1,prehi,r+1, inHi,preorder,inorder);
        return root;

    }
}