class Solution {
    public long maxRunTime(int n, int[] b) {
        long s = 0;
        for (int x : b) {
            s += x;
        }

        long l = 0;
        long h = s / n; 
        long t = 0;

        while (l <= h) {
            long m = l + (h - l) / 2;
            
            if (c(n, b, m)) {
                t = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return t;
    }

    private boolean c(int n, int[] b, long t) {
        if (t == 0) return true;

        long a = 0;
        for (int c : b) {
            a += Math.min((long)c, t);
        }

        long r = (long)n * t;

        return a >= r;
    }
}