class Solution {
    public String convert(String s, int numRows) {
        // charArray로 변환 및 n번째 줄에 해당하는 글자를 담을 StringBuffer 생성
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] str = new StringBuffer[numRows];
        for (int i = 0; i < str.length; i++)
            str[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++)
                str[idx].append(c[i++]);
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--)
                str[idx].append(c[i++]);
        }
        for (int idx = 1; idx < str.length; idx++)
            str[0].append(str[idx]);
        
        return str[0].toString();
    }
}