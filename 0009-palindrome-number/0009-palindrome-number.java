class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        StringBuffer sb = new StringBuffer(num);
        String reversed = sb.reverse().toString();

        return num.equals(reversed);
    }
}