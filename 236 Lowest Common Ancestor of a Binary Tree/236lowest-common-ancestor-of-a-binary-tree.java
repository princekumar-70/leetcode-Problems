class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        boolean pInLeft = isPresent(root.left, p);
        boolean qInLeft = isPresent(root.left, q);

        if (pInLeft && qInLeft)
            return lowestCommonAncestor(root.left, p, q);


        if (!pInLeft && !qInLeft)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    private boolean isPresent(TreeNode root, TreeNode target) {
        if (root == null) return false;
        if (root == target) return true;

        return isPresent(root.left, target) || isPresent(root.right, target);
    }
}
