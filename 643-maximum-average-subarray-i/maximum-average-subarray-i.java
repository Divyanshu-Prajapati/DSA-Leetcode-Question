class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=0;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        while(end<nums.length){
            currsum+=nums[end];
            if(end>=k-1){
                maxsum=Math.max(currsum,maxsum);
                currsum=currsum-nums[start];
                start++;
            }
            end++;
        }
        return (double)maxsum/k;
    }
}