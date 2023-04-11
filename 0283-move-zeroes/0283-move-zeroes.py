class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        zero = nums.count(0)
        rmv = {0}
        nums2 = [i for i in nums if i not in rmv]
        zeroArr = [0 for _ in range(zero)]
        nums.clear()
        nums.extend(nums2 + zeroArr)