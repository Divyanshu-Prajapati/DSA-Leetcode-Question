class Solution {
    public static int n;
    public static int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void DFSleft(TreeNode root,int level,List<Integer> list){
        if(root==null)return;
        if(level==n)list.add(root.val);
            DFSleft(root.left,level+1,list);
            DFSleft(root.right,level+1,list);       
    }
    public void DFSright(TreeNode root,int level,List<Integer> list){
        if(root==null)return;
        if(level==n)list.add(root.val);
            DFSright(root.right,level+1,list);
            DFSright(root.left,level+1,list);       
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int l=level(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            n=i;
            List<Integer> list=new ArrayList<>();
            if(i%2==0)DFSleft(root,0,list);
            else{
                DFSright(root,0,list);
            }
            
            ans.add(list);
        }
        
        return ans;
    }
}