class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) {
            String res = "";
            for (int i =0; i<s.length(); i+=k) {
                String subStr = s.substring(i, Math.min(i+k, s.length()));
                int sum = 0;
                for (int j = 0; j < subStr.length(); j++) {
                    sum += subStr.charAt(j) - '0';
                }
                res += "" + sum;
            }
            s = res;
        }
        return s;
    }
}