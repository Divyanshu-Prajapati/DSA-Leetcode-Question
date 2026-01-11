class Solution {
    int n;
    public int level(TreeNode root){
        if(root==null)return 0;
       return 1 + Math.max(level(root.left),level(root.right));
    }
    public void order(int i,List<Integer> list,TreeNode root){
        if(root==null)return;
        order(i+1,list,root.left);
        if(i==n)list.add(root.val);
        order(i+1,list,root.right);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        int l= level(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            n=i;
            List<Integer> list=new ArrayList<>();
            order(0,list,root);
            ans.add(list);
        }
        List<Double> ansval=new ArrayList<>();
        for(List<Integer> arr:ans){
            double sum=0;
            for(int i=0;i<arr.size();i++){
                sum+=arr.get(i);
            }
            double val=(double)sum/arr.size();
            ansval.add(val);
        }
        return ansval;
    }
}