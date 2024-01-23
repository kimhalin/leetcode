class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum(), average = sum / 3;
        if (sum % 3 != 0) return false;

        int l = 0, r = arr.length - 1;
        int leftSum = arr[l++], rightSum = arr[r--];

        while (l < r) {
            if (leftSum != average)
                leftSum += arr[l++];
            if (l < r && rightSum != average)
                rightSum += arr[r--];
            if (l <= r && leftSum == average && rightSum == average)
                return true;
        }
        return false;
    }
}