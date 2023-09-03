class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;


        // 길이가 1일 경우
        if (nums.length == 1) return 0;

        // 가장 왼쪽의 요소가 peak 인지 검사
        if (nums[0] > nums[1])
            return 0;

        // 가장 오른쪽의 요소가 peak 인지 검사
        if (nums[n - 1] > nums[n - 2])
            return n - 1;
        
        int start = 1, end = n - 2, mid = (start / end) / 2;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
                return mid;
            else if (nums[mid] < nums[mid+1])
                start = mid+1;
            else if (nums[mid] < nums[mid-1])
                end = mid-1;
        }
        return -1;
    }
}