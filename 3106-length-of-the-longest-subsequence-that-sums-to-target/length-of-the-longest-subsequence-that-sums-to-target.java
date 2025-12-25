class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][]=new int[nums.size()][target+1];
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
        int ans=findlength(nums,target,0,dp);
        return (ans<0)?-1:ans;
        
        
    }
    public int findlength(List<Integer> arr,int target,int i,int[][]dp){
        if(target==0)return 0;
        if(i==arr.size()){
            return -100000;        
        }
        if(dp[i][target]!=-1)return dp[i][target];
        int skip=findlength(arr,target,i+1,dp);
        int pick=-100000;
        if(arr.get(i)<=target){
           pick= 1+findlength(arr,target-arr.get(i),i+1,dp);
        } 
        return dp[i][target]= Math.max(skip,pick);
    }
}
