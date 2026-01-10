class Solution {
    public void preorder(TreeNode root,List<TreeNode> list){
        if(root==null)return;
        list.add(root);
        preorder(root.left,list);
        preorder(root.right,list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        preorder(root,list);
        TreeNode curr=root;
        for(int i=0;i<list.size();i++){
           if(i!=list.size()-1) list.get(i).right=list.get(i+1);
           list.get(i).left=null;
        }
    }
}