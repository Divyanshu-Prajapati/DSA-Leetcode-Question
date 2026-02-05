class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int l=0;
        int r=0;
        int sum=0;
        int n=nums.length;
        int max=0;
        while(r<n){
            int temp=nums[r];
            if(!set.contains(temp)){
                sum=sum+temp;
                max=Math.max(sum,max);
                set.add(temp);
                r++;
            }
            else{
                sum=sum-nums[l];
                set.remove(nums[l]);
                l++;
            }
        }
        return max;

          }
}