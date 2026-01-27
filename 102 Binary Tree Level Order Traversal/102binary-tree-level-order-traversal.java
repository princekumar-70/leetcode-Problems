
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> lists = new ArrayList<>(); 
        Queue<Pair> q = new LinkedList<>();
        if(root==null) return lists;
	
		q.add(new Pair(root,0));
		while(q.size()>0) {
			Pair front = q.remove();
			if (front.level == lists.size()) {
                lists.add(new ArrayList<>());
            }

            lists.get(front.level).add(front.node.val);
			
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