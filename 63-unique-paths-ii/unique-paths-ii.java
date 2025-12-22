class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        if(arr[0][0]==1)return 0;
        if(arr[m-1][n-1]==1)return 0;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
       return helper(0,0,m-1,n-1,arr,dp);
    }
    public static int helper(int sr,int sc,int row,int col,int [][]arr,int[][]dp){
        if(sr>row||sc>col)return 0;
        if(arr[sr][sc]==1)return 0;
        if(sr==row&& sc==col)return 1;
        if(dp[sr][sc]!=-1)return dp[sr][sc];
        int ans=0;
        if(sc<col && arr[sr][sc+1]!=1){
            int right=helper(sr,sc+1,row,col,arr,dp);
            ans+=right;
            
        }
        if(sr<row && arr[sr+1][sc]!=1){
            int down=helper(sr+1,sc,row,col,arr,dp);
            ans+=down;
        }
        dp[sr][sc]=ans;
        return ans;
        
    }
}