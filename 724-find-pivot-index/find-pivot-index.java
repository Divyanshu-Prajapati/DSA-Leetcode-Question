class Solution {
    

    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];//for left traverse karenge
        int suffix[]=new int[n];//for right traverse karenge
        
        //for prefix
        prefix[0]=0;
        suffix[n-1]=0;
        for(int i=1;i<n;i++){
            prefix[i]=nums[i-1]+prefix[i-1];
            
        }

        //for suffix
        for(int i=n-2;i>=0;i--){
            suffix[i]=nums[i+1]+suffix[i+1];
            
        }
        
            //for check`
        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i]){
                return i;
            } 
             
        }
        return -1;
    }
}