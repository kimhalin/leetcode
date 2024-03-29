class Solution {
    public int[] searchRange(int[] nums, int target) {
        // 내림차순
        int start = firstGreaterEqual(nums, target);
        if (start == nums.length || nums[start] != target)
            return new int[] {-1, -1};
        return new int[]{start, firstGreaterEqual(nums, target + 1) - 1};
    }

    public int firstGreaterEqual(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}