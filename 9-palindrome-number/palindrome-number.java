class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String s1=""+x;
        StringBuilder str=new StringBuilder(s1);
        str.reverse();
        String s2=str.toString();
        if(s1.equals(s2))return true;
        else return false;
     }
}