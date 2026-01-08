class Solution {
    public TreeNode bstToGst(TreeNode root) {
        int arr[]=new int[1];
        helper(root,arr);
        return root;
    }
    public void helper(TreeNode root,int[]val){
        if(root==null)return;
        helper(root.right,val);
        root.val=root.val+val[0];
        val[0]=root.val;
        helper(root.left,val);
    }
}