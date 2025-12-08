class Solution {
    public int countTriples(int n) {
        int[] arr = new int[n];
        int x = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = x * x;
            x++;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {         
            for (int j = 0; j < n; j++) {     
                if (i == j) continue;         
                for (int k = 0; k < n; k++) { 
                    if (arr[i] + arr[j] == arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
