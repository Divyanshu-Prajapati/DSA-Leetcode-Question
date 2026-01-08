class Solution {
    public boolean left(TreeNode root,int value){
        if(root==null)return true;
        if(root.val>=value)return false;
        boolean l1=left(root.left,value);
        boolean l2=left(root.right,value);
        if(l1==true && l2==true)return true;
        else return false;
    }
    public boolean right(TreeNode root,int value){
        if(root==null)return true;
        if(root.val<=value)return false;
        boolean l1=right(root.left,value);
        boolean l2=right(root.right,value);
        if(l1==true && l2==true)return true;
        else return false;
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        boolean l1=left(root.left,root.val);
        boolean l2=right(root.right,root.val);
        if(l1==false || l2==false)return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}