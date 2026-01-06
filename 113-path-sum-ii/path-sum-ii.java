class Solution {
    //deep copy-->
    public List<Integer> copy(List<Integer> arr){
        List<Integer> list=new ArrayList<>();
        for(int ele:arr){
            list.add(ele);
        }
        return list;
    }
    public void helper(TreeNode root,int target,List<Integer> arr,List<List<Integer>> ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(target==root.val){
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer> arr1=copy(arr);
        List<Integer> arr2=copy(arr);
        helper(root.left,target-root.val,arr1,ans);
        helper(root.right,target-root.val,arr2,ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetSum,arr,ans);
        return ans;
    }
}