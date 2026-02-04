class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        attach(root, val);
        return root;
    }

    void attach(TreeNode root, int val) {
        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            }
            attach(root.left, val);
        } 
        else { // val > root.val (LeetCode: no duplicates)
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            }
            attach(root.right, val);
        }
    }
}
