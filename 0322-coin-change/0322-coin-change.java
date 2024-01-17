class Solution {
    public int coinChange(int[] coins, int amount) {
        int maxValue = amount + 1;
        int[] minCoins = new int[amount + 1];

        Arrays.fill(minCoins, maxValue);
        minCoins[0] = 0;

        for (int targetAmount = 1; targetAmount <= amount; targetAmount++) {
            for (int coin : coins) {
                if (coin <= targetAmount) {
                    minCoins[targetAmount] = Math.min(minCoins[targetAmount], minCoins[targetAmount - coin] + 1);
                }
            }
        }

        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }
}