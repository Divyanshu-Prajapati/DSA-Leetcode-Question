class Solution {
    public int kthGrammar(int n, int k) {
        return helper(n,k);
        
    }
    //n--> rows k--> column
    public static int helper(int n,double k){
        if(n==1 && k==1){
            return 0;
        }
        double a=Math.pow(2,n-1);
        double mid=a/2;
        if(k<=mid){
           return helper(n-1,k);
           
        }
        else{
           return 1-helper(n-1,k-mid);
            
        }
    }
}