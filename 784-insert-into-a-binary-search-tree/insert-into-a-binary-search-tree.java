class Solution {
    public void insert(TreeNode root,int val){
        if(root.val<val){
            //check for right
            if(root.right==null) root.right=new TreeNode(val);
            else insert(root.right,val);
        }
        else{
            //check for left
            if(root.left==null)root.left=new TreeNode(val);
            else insert(root.left,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        insert(root,val);
        return root;
    }
}