class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int answer = 1;
        Set<Character> set = new HashSet<>();
        if (s.length() == 0)
            return 0;
        set.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left++));
            }
            answer = Math.max(answer, i - left + 1);
            set.add(s.charAt(i));
        }
        return answer;
    }
}