class Solution {
    public int coinChange(int[] arr, int amount) {
        long dp[][]=new long[arr.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                long skip=(i>0)?dp[i-1][j]:(j==0)?0:Integer.MAX_VALUE;
              if(j-arr[i]<0) dp[i][j]=skip;
               else{
                 long take= 1 + dp[i][j-arr[i]]; 
                  dp[i][j]= Math.min(skip,take);
               }
            }
        }
       int ans=(int)dp[arr.length-1][amount];
       if(ans==Integer.MAX_VALUE)return -1;
       return ans;
    }
    // public long countCoin(int i,int[]arr,int amount,long[][]dp){
    //     if(i==-1){
    //         if(amount==0)return 0;
    //         else return Integer.MAX_VALUE;
    //     };
        
        
    // }
}