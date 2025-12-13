class Solution {
    public int fib(int n) {
       return solve(n);
        
    }
    public static int solve(int n){
        if(n==1)return 1;
        if(n==0){
            return 0;
        }
        
        
        
      return  solve(n-1) + solve(n-2);
    }
}