class Solution {
    public int countSquares(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=0 && j!=0){
                    // int x=arr[i-1][j];
                    if(arr[i-1][j]>0 && arr[i][j-1]>0 && arr[i-1][j-1]>0 && arr[i][j]>0){
                        arr[i][j]=Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]))+arr[i][j];
                    }
                    // if(x==arr[i-1][j]&& x==arr[i][j-1] && x==arr[i-1][j-1]){
                    //     arr[i][j]=Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]))+1;
                    // }
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
        
    }
}