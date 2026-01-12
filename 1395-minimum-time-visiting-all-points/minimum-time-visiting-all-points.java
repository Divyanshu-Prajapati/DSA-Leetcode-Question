class Solution {
    public int minTimeToVisitAllPoints(int[][] arr) {
       int time=0;
       for(int i=1;i<arr.length;i++){
        int x1=arr[i-1][0];
        int y1=arr[i-1][1];
        int x2=arr[i][0];
        int y2=arr[i][1];
        int x=Math.abs(x1-x2);
        int y=Math.abs(y1-y2);
        time+=Math.max(x,y);
       }
       return time;
    }
}