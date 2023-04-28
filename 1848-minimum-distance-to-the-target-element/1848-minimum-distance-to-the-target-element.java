class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if(res < Math.abs(i-start)) {
                    return res;
                }
                res = Math.abs(i-start);
            }
        }

        return res;
    }
}