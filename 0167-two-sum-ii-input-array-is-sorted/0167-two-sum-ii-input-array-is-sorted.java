class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 오름차순 배열 numbers
        int ptr = numbers.length - 1;
        int idx = 0;
        

        while (idx < ptr) {
            int sum = numbers[idx] + numbers[ptr];
            if (sum == target)
                return new int[] {idx + 1, ptr + 1};
            else if (sum > target) {
                ptr--;
            }
            else {
                idx++;
            }
        }
        return null;
    }
}