class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findway(nums,0,target);
    }
    public int findway(int[]arr,int idx,int target){
        if(idx==arr.length){
            if(target==0)return 1;
            else return 0;
        }
        int add=findway(arr,idx+1,target-arr[idx]);
        int sub=findway(arr,idx+1,target+arr[idx]);
        return add+sub;
    }
}
