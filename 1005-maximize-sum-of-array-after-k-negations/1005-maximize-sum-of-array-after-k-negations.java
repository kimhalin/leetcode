class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int res = 0;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (k > 0 && nums[i] < 0) {
                res += -nums[i];
                nums[i] = -nums[i];
                k--;
            }

            else if (k > 0 && nums[i] == 0) {
                k = 0;
            }

            else res += nums[i];
        }
        if (k % 2 == 0) return res;
        Arrays.sort(nums);
        return res - nums[0] * 2;
    }
}