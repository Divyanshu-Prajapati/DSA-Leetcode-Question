class Solution {
    public boolean exist(TreeNode root,TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
        return exist(root.left,node) || exist(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root)return root;
        boolean pliesLST=exist(root.left,p);
        boolean qliesLST=exist(root.left,q);
        if(pliesLST==true && qliesLST==true)return lowestCommonAncestor(root.left,p,q);
        if(pliesLST==false && qliesLST==false)return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}