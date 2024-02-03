class Solution {
    int answer = 0;
    public int subsetXORSum(int[] nums) {
        // 선택 x, 앞에서부터 더 선택 
        for (int i = 0; i < nums.length; i++) {
            backTracking(nums, i, nums[i]);
        }

        return answer;
    }

    public void backTracking(int[] nums, int idx, int res) {
        answer += res;
        for (int i = idx + 1; i < nums.length; i++) {
            backTracking(nums, i, res ^ nums[i]);
        }
        return;
    }
}