class Solution {
    public int longestCommonSubsequence(String a, String b) {
       int m=a.length();
       int n=b.length();
       //i goes to m-1 to 0 //j goes to n-1 to 0
      int[][] dp=new int[m][n];
      for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            int p=(i>=1 && j>=1)? dp[i-1][j-1]:0;
            int q=(i>=1)?dp[i-1][j]:0;
            int r=(j>=1)?dp[i][j-1]:0;
            if(a.charAt(i)==b.charAt(j)) dp[i][j]=1+p;
            else dp[i][j]=Math.max(q,r);
        
        }
      }
      return dp[m-1][n-1];
    }
}