class Solution {
    public int n;

    public int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void print(TreeNode root,int level,List<Integer> temp){
        if(root==null)return;
        if(level==n)temp.add(root.val);
        print(root.left,level+1,temp);
        print(root.right,level+1,temp);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int l=level(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            n=i;
            List<Integer> temp=new ArrayList<>();
            print(root,0,temp);
            ans.add(temp);
        }
        return ans;
    }
}