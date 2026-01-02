class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int x=lst(root.left)+lst(root.right);
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        return Math.max(x,Math.max(left,right));
    }
    public int lst(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(lst(root.left),lst(root.right));
    }
}