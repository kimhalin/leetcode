class Solution {
    public String maximumOddBinaryNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                num++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num - 1; i++) {
            sb.append("1");
        }

        for (int i = num; i < s.length(); i++) {
            sb.append("0");
        }

        sb.append("1");

        return sb.toString();
    }
}