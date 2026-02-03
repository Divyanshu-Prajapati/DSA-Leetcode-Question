class Solution {
    public int maxSubArray(int[] nums) {
        //bruteforce-->
        // int value=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         value=Math.max(value,sum);
        //     }
        // }
        // return value;

        //optimal ##Kadane Algorithm
        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currsum=Math.max(nums[i],nums[i]+currsum);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}