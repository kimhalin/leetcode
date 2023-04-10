class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        
        dp = [-10000] * (len(nums) + 1)

        # nums[i]로 시작하는 최대 subarray = max(nums[i + 1]의 최대 subarray + nums[i], nums[i])
        
        for i in range(len(nums)-1, -1, -1):
            dp[i] = max(nums[i], dp[i+1] + nums[i])

        return max(dp)