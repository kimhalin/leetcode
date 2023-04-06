class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        answer = []
        for n in nums:
            answer.append(n ** 2)
        
        return sorted(answer)