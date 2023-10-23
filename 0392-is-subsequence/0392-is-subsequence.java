class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        if (s.length() == 0 || s.length() == 0 && t.length() == 0)
            return true;
        if (t.length() == 0)
            return false;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }

            if (sIndex >= s.length())
                return true;
        }

        return false;
    }
}