class Solution {
    public int minimumCost(int[] cost) {
        int answer = 0;
        // 2 + 1
        Arrays.sort(cost);
        int idx = cost.length - 1;

        while (idx >= 2) {
            answer += (cost[idx] + cost[idx - 1]);
            idx -= 3;
        }

        while (idx >= 0) {
            answer += cost[idx--];
        }

        return answer;
    }
}