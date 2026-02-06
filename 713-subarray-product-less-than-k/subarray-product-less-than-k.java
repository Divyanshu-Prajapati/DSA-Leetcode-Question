class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1;
        int l=0,r=0;
        int n=nums.length;
        int count=0;
        if(k<=1){
            return 0;
        }
        while(r<n){
            product=product*nums[r];
            while(product>=k){
                product=product/nums[l];
                l++;
            }
            if(product<k){
                count=count+(r-l+1);
            }
            r++;
        }
        return count;
    }
}