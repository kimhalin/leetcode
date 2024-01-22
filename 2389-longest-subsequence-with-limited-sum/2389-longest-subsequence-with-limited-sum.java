class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // queries의 숫자보다 요소의 합이 작거나 같은 nums의 subsequence를 구하기
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int idx = 0;
            if (nums[idx] > queries[i]) {
                answer[i] = 0;
                continue;
            }
                
            while (sum < queries[i] && idx < nums.length) {
                sum += nums[idx++];
            }

            if (sum > queries[i])
                answer[i] = --idx;
            else
                answer[i] = idx;
        }

        return answer;
    }
}