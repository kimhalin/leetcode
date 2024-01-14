class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            diff = Math.max(diff, prices[i] - min);
        }

        return diff;
    }
}