class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int ans=0;
        boolean[] isvisited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isvisited[i]){
                ans++;
                bfs(i,adj,isvisited);
            }
        }
        return ans;
    }
    public void bfs(int node,int[][] adj,boolean[]isvisited){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        while(q.size()>0){
            int temp=q.remove();
            for(int i=0;i<adj.length;i++){
                if(adj[temp][i]==1 && isvisited[i]==false){
                    q.add(i);
                    isvisited[i]=true;
                }
            }
        }
    }
}