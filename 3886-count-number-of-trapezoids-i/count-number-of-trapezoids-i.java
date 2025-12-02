import java.util.*;

class Solution {
    private final int MOD = 1_000_000_007;
    private final long INV_2 = 500_000_004L;

    private long c2(int n) {
        if (n < 2) {
            return 0;
        }
        long N = n;
        long num = (N * (N - 1)) % MOD;
        return (num * INV_2) % MOD;
    }

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> yCounts = new HashMap<>();
        for (int[] p : points) {
            yCounts.put(p[1], yCounts.getOrDefault(p[1], 0) + 1);
        }

        List<Integer> yCoords = new ArrayList<>(yCounts.keySet());
        
        Collections.sort(yCoords); 
        
        long total = 0;
        long prefixSum = 0;

        for (int y : yCoords) {
            int n = yCounts.get(y);
            long c2i = c2(n);

            long current = (c2i * prefixSum) % MOD;
            total = (total + current) % MOD;

            prefixSum = (prefixSum + c2i) % MOD;
        }

        return (int) total;
    }
}