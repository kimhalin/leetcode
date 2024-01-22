class Solution {
    public int maxDistance(int[] colors) {

        int idx = colors.length - 1;
        int answer = 0;
        for (int i = 0; i < colors.length; ++i) {
            if (colors[idx] != colors[i]) {
                answer = idx - i;
                break;
            }
        }

        idx = 0;

        for (int i = colors.length - 1; i >= 0; --i) {
            if (colors[idx] != colors[i]) {
                answer = Math.max(i - idx, answer);
                break;
            }
        }

        return answer;
    }
}