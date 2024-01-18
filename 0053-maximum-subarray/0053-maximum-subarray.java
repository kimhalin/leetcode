class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i];
                continue;
            }
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }

        return Arrays.stream(dp).max().getAsInt();
    }
}