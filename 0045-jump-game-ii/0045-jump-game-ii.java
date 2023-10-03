class Solution {
    public int jump(int[] nums) {
        int maxVal = 0;
        int curEnd = 0;
        int jumps = 0;
        for (int i =0; i < nums.length - 1; ++i) {
            maxVal = Math.max(maxVal, i + nums[i]);

            if (i == curEnd) {
                curEnd = maxVal;
                jumps++;
            }
        }

        return jumps;
    }
}