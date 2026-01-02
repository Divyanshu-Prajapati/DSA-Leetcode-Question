
class Solution {
    public boolean isSymmetric(TreeNode root) {
       return helper(root);
    }
    public void invert(TreeNode root){
        if(root==null)return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }
    public boolean helper(TreeNode root){
        invert(root.left);
        if(!check(root.left,root.right))return false;
        return true;
    }
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null)return true;
        if(root1==null && root2!=null || root2==null && root1!=null)return false;
        if(root1.val!=root2.val)return false;
        boolean b1=check(root1.left,root2.left);
        boolean b2=check(root1.right,root2.right);
        if(b1==false||b2==false)return false;
        return true;

    }
}