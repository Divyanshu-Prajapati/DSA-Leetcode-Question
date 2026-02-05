class Solution {
    HashSet<Character> set=new HashSet<>();
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int max=0;
        int n=s.length();
        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                int len=r-l+1;
                max=Math.max(len,max);
                r++;

            }
            else{    
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
        
    }
}