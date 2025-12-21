class Solution {
    public int helper(int idx, int s1, int sum, int[] arr){
        if(idx==arr.length-1) return 0;
        int s2 = sum - s1;
        int count = 0;
        if((s1-s2)%2==0) count += 1;
        int a=helper(idx+1, s1+=arr[idx],sum,arr);
        return count+=a;
    }
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int ele : nums) sum+=ele ;
        return helper(0,0,sum,nums);
    }
}