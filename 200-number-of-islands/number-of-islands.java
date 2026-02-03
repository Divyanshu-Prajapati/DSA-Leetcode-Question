class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;

        boolean[][] isvisited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && isvisited[i][j]==false){
                    bfs(grid,isvisited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static class Pair{
        int first;
        int last;
        Pair(int f,int l){
            this.first=f;
            this.last=l;
        }
    }
    public static void bfs(char[][] grid,boolean[][] isvisited,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(q.size()>0){
            Pair p=q.remove();
            int f=p.first;
            int l=p.last;
            //for left
            if(l>0 && grid[f][l-1]=='1' && isvisited[f][l-1]==false){
                q.add(new Pair(f,l-1));
                isvisited[f][l-1]=true;
            }
            //for right
            if(l<n-1 && grid[f][l+1]=='1'&& isvisited[f][l+1]==false){
                q.add(new Pair(f,l+1));
                isvisited[f][l+1]=true;
            }

            //for top
            if(f>0 && grid[f-1][l]=='1'&& isvisited[f-1][l]==false){
                q.add(new Pair(f-1,l));
                isvisited[f-1][l]=true;
            }

            //for bottom
            if(f<m-1 && grid[f+1][l]=='1' && isvisited[f+1][l]==false){
                q.add(new Pair(f+1,l));
                isvisited[f+1][l]=true;
            }
        }

    }
}