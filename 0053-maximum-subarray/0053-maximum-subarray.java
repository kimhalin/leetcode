class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            largestSum = Math.max(largestSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return largestSum;
    }
}