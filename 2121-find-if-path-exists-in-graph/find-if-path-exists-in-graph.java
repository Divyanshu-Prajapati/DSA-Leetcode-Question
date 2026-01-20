class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] isvis = new boolean[n];

        q.add(source);
        isvis[source] = true;

        while (q.size() > 0) {
            int front = q.remove();

            if (front == destination) return true;

            for (int nei : adj.get(front)) {
                if (!isvis[nei]) {
                    q.add(nei);
                    isvis[nei] = true;
                }
            }
        }
        return false;
    }
}
