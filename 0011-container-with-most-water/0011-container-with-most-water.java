class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int w = right - left;

            if (height[left] < height[right]){
                maxArea = Math.max(maxArea, w * height[left]);
                left++;
            }
            else if(height[left] > height[right]) {
                maxArea = Math.max(maxArea, w * height[right]);
                right--;
            }
            else {
                maxArea = Math.max(maxArea, w * height[left]);
                left++;
                right--;
            }
        }

        return maxArea;
    }
}