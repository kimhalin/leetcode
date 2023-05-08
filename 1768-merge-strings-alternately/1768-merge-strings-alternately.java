class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] words1 = word1.split("");
        String[] words2 = word2.split("");
        String answer = "";
        if (words1.length > words2.length) {
            int j = 0;
            for (int i = 0; i < words2.length; i++) {
                answer = answer + words1[j++];
                answer = answer + words2[i];
            }

            while(j < words1.length) {
                answer = answer + words1[j++];
            }
        }
        else {
            int j =0;
            for (int i = 0; i < words1.length; i++) {
                answer = answer + words1[i];
                answer = answer + words2[j++];
            }
            while (j < words2.length) {
                answer = answer + words2[j++];
            }
        }
        return answer;
    }
}