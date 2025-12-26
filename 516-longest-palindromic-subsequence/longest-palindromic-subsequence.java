class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        if(n<=1)return n;
        int dp[][]=new int[n][n];
        for(int[]row:dp)Arrays.fill(row,-1);

       int ans= helper(0,s.length()-1,s,dp);
       return ans;
        
    }
    public int helper(int i,int j,String s,int dp[][]){
        if(i>j)return 0;
        if(i==j)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
           return dp[i][j]= 2+helper(i+1,j-1,s,dp);
        }
        else{
            return dp[i][j]= Math.max(helper(i+1,j,s,dp),helper(i,j-1,s,dp));
        }
    }
}

