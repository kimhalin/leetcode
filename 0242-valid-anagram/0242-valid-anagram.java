class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCounts = new int[26];
        
        for (char c : t.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c-'a'] < 0)
                return false;
        }
        int answer = Arrays.stream(charCounts).sum();

        return answer == 0;
    }
}