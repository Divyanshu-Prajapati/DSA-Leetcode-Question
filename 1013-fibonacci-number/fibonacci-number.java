class Solution {
    public int fib(int n) {
       return solve(n,0,1);
        
    }
    public static int solve(int n,int a,int b){
        int c=a+b;
        if(n==0){
            return a;
        }
    


        
      return  solve(n-1,b,c);
    }
}