class Solution {
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int n=list.size()-1;
        return maketree(list,0,n);
    }
    public TreeNode maketree(List<Integer> list,int lo,int hi){
        if(lo>hi)return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=maketree(list,lo,mid-1);
        root.right=maketree(list,mid+1,hi);
        return root;

    }
}