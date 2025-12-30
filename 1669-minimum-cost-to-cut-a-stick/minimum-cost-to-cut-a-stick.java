class Solution {
    public int minCost(int n, int[] cuts) {
        int arr[]=new int[cuts.length+2];
        int i;
        for(i=0;i<cuts.length;i++){
            arr[i]=cuts[i];
        }
        arr[i]=0;i++;
        arr[i]=n;
        Arrays.sort(arr);
        //i goes to 1 to arr.length-2 & j goes to arr.length-2 to 1
        int [][]dp=new int[arr.length-1][arr.length-1];
        for(int row[]:dp)Arrays.fill(row,-1);
        return cost(1,arr.length-2,arr,dp);
    }
    public int cost(int i,int j,int[]arr,int[][]dp){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int len=arr[j+1]-arr[i-1];
            int totalcost=cost(i,k-1,arr,dp)+cost(k+1,j,arr,dp)+len;
            min=Math.min(min,totalcost);
        }
        return dp[i][j]= min;
    }
}