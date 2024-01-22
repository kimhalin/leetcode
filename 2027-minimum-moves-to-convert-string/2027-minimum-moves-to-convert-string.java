class Solution {
    public int minimumMoves(String s) {
        int idx = 0;
        int res = 0;
        while (idx < s.length()) {
            if (s.charAt(idx) == 'X'){
                if (idx + 2 < s.length()) {
                    res++;
                    idx += 3;
                }
                else {
                    res++;
                    break;
                }
            }
            else idx++;
        }

        return res;
    }
}