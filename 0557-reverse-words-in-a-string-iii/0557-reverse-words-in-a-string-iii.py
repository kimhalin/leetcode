class Solution:
    def reverseWords(self, s: str) -> str:
        sArr = s.split()
        print(sArr)
        s = ""
        for myStr in sArr:
            s = s + "".join(reversed(myStr)) + " "

        return s[:-1]