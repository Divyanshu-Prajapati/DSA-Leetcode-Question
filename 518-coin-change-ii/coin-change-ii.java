class Solution {
    public int change(int amount,int[] arr) {
        long dp[][]=new long[arr.length][amount+1];
        for(long x[]:dp){
            Arrays.fill(x,-1);
        }
        
       int ans=(int)countCoin(0,arr,amount,dp);
       return ans;
    }
    public long countCoin(int i,int[]arr,int amount,long[][]dp){
        if(i==arr.length){
            if(amount==0){
                return 1;
            }
            else return 0;
        };
        if(dp[i][amount]!=-1)return dp[i][amount];
        long skip=countCoin(i+1,arr,amount,dp);
        if(amount-arr[i]<0)return skip;
        long take=countCoin(i,arr,amount-arr[i],dp);
        return dp[i][amount]= skip+take;
        
    }
}