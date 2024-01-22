class Solution {
    public int convertTime(String current, String correct) {
        String[] curArr = current.split(":");
        int cur = Integer.parseInt(curArr[0]) * 60 + Integer.parseInt(curArr[1]);
        String[] corArr = correct.split(":");
        int cor = Integer.parseInt(corArr[0]) * 60 + Integer.parseInt(corArr[1]);

        int diff = cor - cur;
        int answer = 0;

        while (diff > 0) {
            if (diff >= 60) {
                diff -= 60;
            }
            else if (diff >= 15) {
                diff -= 15;
            }

            else if (diff >= 5) {
                diff -= 5;
            }

            else {
                diff -=1;
            }
            answer++;
        }

        return answer;
    }
}