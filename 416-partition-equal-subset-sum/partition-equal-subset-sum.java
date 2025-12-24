class Solution {
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)return false;
        int target=sum/2;
        //do value change ho rhi so we take 2D dp
        //i goes-> 0-arr.length, sum->0 to target
        int [][]dp=new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,arr,0,target,dp);
    }
    public static boolean helper(int i,int[]arr,int currsum,int target,int[][]dp){
        if(currsum==target)return true;
        if(i==arr.length || currsum>target)return false;
        if(dp[i][currsum]!=-1)return (dp[i][currsum]==1);
        boolean skip=helper(i+1,arr,currsum,target,dp);
        boolean take=helper(i+1,arr,currsum+arr[i],target,dp);
        if(skip||take){
            dp[i][currsum]=1;
        }
        else{
            dp[i][currsum]=0;
        }
        return skip||take;  
    }
}