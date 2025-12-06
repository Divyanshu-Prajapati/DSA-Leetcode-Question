import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int MOD = 1_000_000_007;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 1;
        
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        
        int left = 0;
        
        for (int i = 0; i < n; i++) {
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[i]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(i);
            
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[i]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(i);
            
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                left++;
                if (maxDeque.peekFirst() < left) maxDeque.pollFirst();
                if (minDeque.peekFirst() < left) minDeque.pollFirst();
            }
            
            int currentWays = prefixSum[i];
            if (left > 0) {
                currentWays = (currentWays - prefixSum[left - 1] + MOD) % MOD;
            }
            
            dp[i + 1] = currentWays;
            prefixSum[i + 1] = (prefixSum[i] + dp[i + 1]) % MOD;
        }
        
        return dp[n];
    }
}