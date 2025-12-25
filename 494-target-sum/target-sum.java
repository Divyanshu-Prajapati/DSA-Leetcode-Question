class Solution {
    static int sum;
    public int findTargetSumWays(int[] nums, int target) {
        //i goes to 0 to nums.length
        //target goes to -sum to sum
        for(int val:nums){
            sum+=val;
        }
        int dp[][]=new int[nums.length][2*sum+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return findway(nums,0,0,target,dp);
    }
    public int findway(int[]arr,int idx,int res,int target,int dp[][]){
        if(idx==arr.length){
            if(res==target)return 1;
            else return 0;
        }
        if(dp[idx][res+sum]!=-1)return dp[idx][res+sum];
        int add=findway(arr,idx+1,res+arr[idx],target,dp);
        int sub=findway(arr,idx+1,res-arr[idx],target,dp);
        return add+sub;
    }
}