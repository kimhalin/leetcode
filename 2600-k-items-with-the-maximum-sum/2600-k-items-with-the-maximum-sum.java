class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int answer = 0;

        while (numOnes > 0 && k > 0) {
            answer++;
            numOnes--;
            k--;
        }

        while (numZeros > 0 && k > 0) {
            numZeros--;
            k--;
        }

        while (numNegOnes > 0 && k > 0) {
            answer--;
            numNegOnes--;
            k--;
        }

        return answer;
    }
}