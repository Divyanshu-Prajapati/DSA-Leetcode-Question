class Solution {
    public int n;
    public int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void DFS(TreeNode root,int level,List<Integer> list){
        if(root==null)return;
        if(n==level)list.add(root.val);
        DFS(root.left,level+1,list);
        DFS(root.right,level+1,list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int l=level(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            n=i;
            List<Integer> list=new ArrayList<>();
            DFS(root,0,list);
            ans.add(list);
        }
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            List<Integer> x=ans.get(i);
            int b=x.get(x.size()-1);
            temp.add(b);
        }
        return temp;
    }
}