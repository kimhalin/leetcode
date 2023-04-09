class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        # 값이 같은 요소의 합을 각각 구한다.
        # i를 하나씩 증가시키면서 값이 i인 요소들의 합을 하나씩 더하기

        dp = [0] * (max(nums) + 1)
        for n in nums:
            dp[n] += n
        
        for i in range(2, len(dp)):
            dp[i] = max(dp[i] + dp[i-2], dp[i-1]) # i요소를 선택할 경우
        
        return dp[len(dp)-1]