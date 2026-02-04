class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int end=0;
        int currcount=0;
        int maxcount=Integer.MIN_VALUE;
        while(end<s.length()){
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u'){
                currcount++;
            }
            if(end>=k-1){
                maxcount=Math.max(currcount,maxcount);
                if(s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u'){
                    currcount=currcount-1;
                }
                start++;
            }
            end++;
        }
        return maxcount;
    }
}