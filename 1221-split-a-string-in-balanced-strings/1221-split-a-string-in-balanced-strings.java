class Solution {
    public int balancedStringSplit(String s) {
        int rNum = 0, lNum = 0;
        int res = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                rNum++;
            else
                lNum++;
            if (rNum != 0 && rNum == lNum) {
                res++;
            }
        }
        return res;
    }
}