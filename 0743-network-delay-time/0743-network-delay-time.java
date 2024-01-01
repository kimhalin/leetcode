class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) {
            graph.putIfAbsent(t[0],new ArrayList<int[]>());
            graph.get(t[0]).add(new int[]{t[1], t[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0]));
        boolean[] visited = new boolean[n+1];
        int[] minDis = new int[n+1];
        minDis[k] = 0;
        Arrays.fill(minDis, Integer.MAX_VALUE);
        pq.offer(new int[] {0, k});
        int max = 0;
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currNode = curr[1];
            if (visited[currNode]) continue;
            visited[currNode] = true;
            int currDis = curr[0];
            max = currDis;
            n--;
            if (!graph.containsKey(currNode)) continue;
            for (int[] next : graph.get(currNode)) {
                if (!visited[next[0]] && currDis + next[1] < minDis[next[0]])
                    pq.offer(new int[]{currDis + next[1], next[0]});
            }
        }
        return n == 0 ? max : -1;
    }
}