class Solution:
    def findSubarrays(self, nums: List[int]) -> bool:
        res = []
        for i in range(len(nums)-1):
            if nums[i] + nums[i+1] in res:
                return True
            res.append(nums[i] + nums[i+1])
        
        return False