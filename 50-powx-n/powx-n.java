class Solution {
    public double myPow(double x, int n) {
        double ans=calculate(x,n);
        if(n<0)return 1/ans;
        else return ans;
    }
    public double calculate(double x,int n){
        if(n==0)return 1;
        double b=calculate(x,n/2);
        if(n%2==0){
            return b*b;
        }
        else{
            return b*b*x;
        }
        }
}