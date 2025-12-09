class Solution {
    public int totalNQueens(int n) {
         char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        nqueens(board,0,ans);
        return ans.size();
    }
    public boolean isSafe(char[][]board,int row,int col){
        int n=board.length;
        //check row-->
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //check column
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }

        //check northEast-->
        int i=row;
        int j=col;
        while(i>=0 &&j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }

        //check for south east-->
        i=row;
        j=col;
        while(j<n && i<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }

        //check for south west
        i=row;
        j=col;
        while(j>=0 && i<n){
            if(board[i][j]=='Q')return false;
            j--;
            i++;
        }

        //check for north west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;

        }
        return true;
    }

    public void nqueens(char[][]board,int row,List<List<String>>ans){
        int n=board.length;
        if(row==n){//base case hoga
           //now we need to convert int array to list of string
           List<String> l=new ArrayList<>();
           for(int i=0;i<n;i++){
            String str="";
              for(int j=0;j<n;j++){
                str=str+board[i][j];
              }
              l.add(str);
           }
           ans.add(l);
           return;
        }
        for(int j=0;j<n;j++){//work and call
             if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueens(board,row+1,ans);//recursion call
                board[row][j]='.';//backtracking
             }
        }

    }

   
}