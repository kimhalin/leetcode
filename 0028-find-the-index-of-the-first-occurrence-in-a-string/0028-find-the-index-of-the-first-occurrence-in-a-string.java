class Solution {
    public int strStr(String haystack, String needle) {
        int answer = -1;
        int idx = 0;
        char[] needles = needle.toCharArray();
        for (int i = 0; i < haystack.length(); i++) {
            if (needles[idx] == haystack.charAt(i)) {
                idx++;
            }
            else {
                i = i - idx;
                idx = 0;
            }
            if (idx == needles.length)
                return i - idx + 1;

        }
        return -1;
    }
}