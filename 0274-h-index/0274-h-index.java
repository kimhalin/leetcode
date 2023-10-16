class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n+1];

        for (int c : citations) {
            if (c >= n)
                buckets[n]++;
            else
                buckets[c]++;
        }

        // buckets[0] ~ buckets[n]의 합이 n보다 작기 직전까지 for문
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += buckets[i];
            if (sum >= i)
                return i;
        }

        return 0;
    }
}