class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, buy = 0;
        int N = prices.length;
        int answer = 0;

        while (sell < N && buy < N) {
            while (buy < N - 1 && prices[buy] > prices[buy + 1])
                buy++;

            sell = buy;

            while (sell < N - 1 && prices[sell] < prices[sell + 1])
                sell++;

            answer += prices[sell] - prices[buy];
            buy = sell + 1;
        }

        return answer;
    }
}