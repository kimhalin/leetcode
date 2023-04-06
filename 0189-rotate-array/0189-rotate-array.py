class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k = k % len(nums)
        answer = []
        left = nums[len(nums)-k:]
        right = nums[:len(nums)-k]

        answer = left + right
        nums.clear()
        nums.extend(answer)