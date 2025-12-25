class Solution {
    public long maxScore(int[] nums, int x) {
        long dp[][]=new long[nums.length][2];
        for(long[]row:dp)Arrays.fill(row,-1);
        return nums[0] + helper(1, nums, x, nums[0] % 2,dp);
    }

    public static long helper(int i, int[] nums, int x, int lastParity,long[][]dp) {
        if (i == nums.length) return 0;
        if(dp[i][lastParity]!=-1)return dp[i][lastParity];       
        long skip = helper(i + 1, nums, x, lastParity,dp);

      
        int currParity = nums[i] % 2;
        long take = nums[i] + helper(i + 1, nums, x, currParity,dp);

        if (currParity != lastParity) {
            take -= x;
        }

        return dp[i][lastParity]=Math.max(skip, take);
    }
}
