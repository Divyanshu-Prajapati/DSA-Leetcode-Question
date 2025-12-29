class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int k = 0; k < n; k++) {
            int i = 0, j = k;
            while (j < n) {
                if (i == j) {
                    dp[i][j] = 1;
                }
                else if (j == i + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                    }
                }
                else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                        dp[i][j] = 1;
                    }
                }
                i++;
                j++;
            }
        }

        int maxLen = 0;
        int start = 0;

        for (int k = n - 1; k >= 0; k--) {
            int i = 0, j = k;
            while (j < n) {
                if (dp[i][j] == 1) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
                i++;
                j++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
