//we find the inorder treversal of binary tree then check
//if a list is in sorted order then it is Binary Search tree else not .
class Solution {
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1))return false;
        }
        return true;
    }
}