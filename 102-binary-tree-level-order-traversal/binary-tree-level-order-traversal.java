class Solution {
    public int n;

    public int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }

    private void BFS(TreeNode root,List<List<Integer>> ans){
        Queue<Pair> q=new LinkedList<>();
        if(root!=null)q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            TreeNode temp=front.node;
            int level=front.level;

            ans.get(level).add(temp.val);

            if(temp.left!=null){
                q.add(new Pair(temp.left,level+1));
                }
            if(temp.right!=null){
                q.add(new Pair(temp.right,level+1));
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int l=level(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            List<Integer> temp=new ArrayList<>();
            ans.add(temp);
        }
        BFS(root,ans);
        return ans;
    }
}