class Solution {
    public int coinChange(int[] arr, int amount) {
        long dp[][]=new long[arr.length][amount+1];
        for(long x[]:dp){
            Arrays.fill(x,-1);
        }
       int ans=(int)countCoin(0,arr,amount,dp);
       if(ans==Integer.MAX_VALUE)return -1;
       return ans;
    }
    public long countCoin(int i,int[]arr,int amount,long[][]dp){
        if(i==arr.length){
            if(amount==0)return 0;
            else return Integer.MAX_VALUE;
        };
        if(dp[i][amount]!=-1)return dp[i][amount];
        long skip=countCoin(i+1,arr,amount,dp);
        if(amount-arr[i]<0)return skip;
        long take= 1 + countCoin(i,arr,amount-arr[i],dp);
        return dp[i][amount]= Math.min(skip,take);
        
    }
}