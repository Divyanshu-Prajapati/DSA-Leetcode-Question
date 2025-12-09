class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[]isValid=new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }
    public void helper(int nums[],List<Integer> ds,boolean[]isValid,List<List<Integer>> ans){
        int n=nums.length;
        if(ds.size()==n){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums,ds,isValid,ans);
                isValid[i]=false;
                ds.remove(ds.size()-1);

            }
        }
    }
}




// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> out=new ArrayList<>();
//         String str="";
//         for(int i=0;i<nums.length;i++){
//             str=str+nums[i];
//         }
//         helper(str,"",out);
//         return out;
        
//     }
//     public static void helper(String str,String t,List<List<Integer>> out){
//         if(str.equals("")){
//             List<Integer> inn=new ArrayList<>();
//             for(int i=0;i<t.length();i++){
//                 inn.add(t.charAt(i)-'0');
//             }
//             out.add(inn);
//             return;
            
//         }
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             String left=str.substring(0,i);
//             String right=str.substring(i+1);
//             String rem=left+right;
//             helper(rem,t+ch,out);
//         }
//     }
// }