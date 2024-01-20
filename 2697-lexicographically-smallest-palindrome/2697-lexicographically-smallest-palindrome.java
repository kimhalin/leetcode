class Solution {
    public String makeSmallestPalindrome(String s) {
        int end = s.length() - 1;
        String ans = s;
        for (int i = 0; i < s.length(); i++) {
            if (end <= i) break;
            if (s.charAt(i) != s.charAt(end)) {
                if (s.charAt(i) > s.charAt(end)) {
                    ans = ans.substring(0, i) + Character.toString(ans.charAt(end)) + ans.substring(i + 1);
                }
                else {
                    ans =ans.substring(0, end) + Character.toString(ans.charAt(i)) + ans.substring(end + 1);
                }
            }

            end--;
        }

        return ans;
    }
}