class Solution {
    //by DFS -> Depth First Search
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int ans=0;
        boolean[] isvisited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isvisited[i]){
                dfs(i,adj,isvisited);
                ans++;
                
            }
        }
        return ans;
    }
    public void dfs(int i,int[][] adj,boolean[]isvisited){
             isvisited[i]=true;
            for(int j=0;j<adj.length;j++){
                if(adj[i][j]==1 && isvisited[j]==false){
                   dfs(j,adj,isvisited);
                    
                }
            }
        
    }
}