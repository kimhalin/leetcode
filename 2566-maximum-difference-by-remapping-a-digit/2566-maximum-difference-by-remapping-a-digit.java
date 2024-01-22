class Solution {
    public int minMaxDifference(int num) {
        String str = num + "";
        int idx = 0;
        char first = str.charAt(0);

        while (first == '9' && idx < str.length()) {
            first = str.charAt(idx++);
        }
        
        String max = str.replaceAll(Character.toString(first), "9");
        String min = str.replaceAll(Character.toString(str.charAt(0)), "0");

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}