class Solution {
    public int value;
    public int j;
    public int i;
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        i++;
        if(i==j)value=root.val;
        helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        i=0;
        j=k;
        helper(root);
        return value;
    }
}