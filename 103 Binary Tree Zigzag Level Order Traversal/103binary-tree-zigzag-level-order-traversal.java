// this question is as like level tranversal but there is some modifications like we know it traverse through level wise but in this question it print zigzag values in arralist; then we use odd even concept in it to solve it 
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if(root==null) return lists;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            if (front.level == lists.size()) {
	                lists.add(new ArrayList<>());
	       }

	         if (front.level % 2 == 0) {
                lists.get(front.level).add(front.node.val);     
            } else {
                lists.get(front.level).add(0, front.node.val);   
            }
            
             if(front.node.left!=null) {
					q.add(new Pair(front.node.left , front.level+1));
				}
                 if(front.node.right!=null) {
					q.add(new Pair(front.node.right , front.level+1));
				}
				
			
	        
				

        }
        return lists;
        
    }
}
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}