class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        Deque<int[]> queue = new ArrayDeque<>();
        Set<String> seen = new HashSet<>();

        queue.addLast(new int[]{0, 0});
        seen.add(0 + "," + 0);
        while (queue.size() > 0) {
            int[] currSearch = queue.removeFirst();
            int a = currSearch[0], b = currSearch[1];

            if (a + b == targetCapacity) return true;

            List<int[]> nextMoves = new ArrayList<>();
            nextMoves.add(new int[]{jug1Capacity, b});
            nextMoves.add(new int[]{a, jug2Capacity});
            nextMoves.add(new int[]{0, b});
            nextMoves.add(new int[]{a, 0});
            nextMoves.add(new int[]{Math.max(0, a - (jug2Capacity - b)), Math.min(a + b, jug2Capacity)});
            nextMoves.add(new int[]{Math.min(a + b, jug1Capacity), Math.max(0, b - (jug1Capacity - a))});

            for (int[] move : nextMoves) {
                String key = move[0] + "," + move[1];
                if (!seen.contains(key)) {
                    seen.add(key);
                    queue.addLast(move);
                }
            }
        }
        return false;
    }
}