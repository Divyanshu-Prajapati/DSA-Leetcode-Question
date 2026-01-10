//BY Recursion -->
class Solution {
    public void preorder(TreeNode root){
        if(root==null)return;
        if(root.left!=null){
            TreeNode pred=root.left;
            while(pred.right!=null){
            pred=pred.right;
        }
        pred.right=root.right;
        root.right=root.left;
        root.left=null;
        }
       
        
        preorder(root.right);
    }
    public void flatten(TreeNode root) {
        preorder(root);
    }
}