class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        int start = 0;
        int last = s.length() - 1;

        String str = s.toLowerCase();

        while (start <= last) {
            char cStart = s.charAt(start);
            char cLast = s.charAt(last);

            if (!Character.isLetterOrDigit(cStart))
                start++;
            else if (!Character.isLetterOrDigit(cLast))
                last--;
            else {
                if (Character.toLowerCase(cStart) != Character.toLowerCase(cLast))
                    return false;
                start++;
                last--;
            }
        }
        return true;
    }
}