class Solution:
    # 각 집에는 일정 금액의 돈이 있다.
    # 보안시스템이 인접한 집에도 경보가 울림
    # 경찰에 알리지 않고 훔칠 수 있는 최대 금액 반환
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0
        if len(nums) == 1: return nums[0]
        if len(nums) == 2: return max(nums)
        
        dp = [0]*len(nums)
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])
        for i in range(2, len(nums)):
            dp[i] = max(dp[i-1], nums[i]+dp[i-2])
        
        return dp[-1]
