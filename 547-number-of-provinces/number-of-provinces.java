class Solution {
    public void bfs(int i ,int[][]arr,boolean[] isvis){
        int n=arr.length;
        isvis[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.remove();
            for(int j=0;j<n;j++){
                if(arr[front][j]==1 && isvis[j]==false){
                    q.add(j);
                    isvis[j]=true;
                }
            }
        }

    }
    public int findCircleNum(int[][] arr) {
        int n=arr.length;
        int count=0;
        boolean isvis[]=new boolean[n];
        for(int i=0;i<n;i++){
           if(!isvis[i]){
            bfs(i,arr,isvis);
              count++;
           }
        }
        return count;

    }
}