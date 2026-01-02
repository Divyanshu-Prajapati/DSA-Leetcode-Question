class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        String str="";
        List<String> list=new ArrayList<>();
        helper(list,root,str);
        return list;
    }
    public void helper(List<String> list,TreeNode root,String str){
        if(root==null)return;
        if(root.left==null && root.right==null){//means hum leaf node par hai
          str+=root.val;
          list.add(str);
          return;
        }
        helper(list,root.left,str+root.val+"->");
        helper(list,root.right,str+root.val+"->");
    }
}