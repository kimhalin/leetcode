class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res = 0
        for i in range(len(s)):
            substr = ""
            for j in range(i,len(s)):
                if s[j] in substr:
                    break
                substr += s[j]
            res = max(len(substr), res)
        return res