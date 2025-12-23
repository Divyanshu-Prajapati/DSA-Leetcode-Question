class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return findsquare(n,dp);       
    }
    public int findsquare(int n,int[]dp) {
        if(isperfect(n))return 1;
        if(dp[n]!=-1)return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int count=findsquare(i*i,dp)+findsquare(n-i*i,dp);
            min=Math.min(count,min);
            dp[n]=min;
        }
        return min;
    }
    public boolean isperfect(int n){
        int x=(int)Math.sqrt(n);
        return (x*x==n);
    }
}