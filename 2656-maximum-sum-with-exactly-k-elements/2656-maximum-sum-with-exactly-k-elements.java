class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max =0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        for (int i = 0; i < k; i++) {
            res += (max + i);
        }

        return res;
    }
}