class Solution {
    public int maximum69Number (int num) {
        int number = num;
        int[] arr = new int[4];
        int[] tmp = new int[] {1, 10, 100, 1000};
        int idx = 0;
        while (number > 0) {
            arr[idx++] = number % 10;
            number /= 10;
        }

        for (int i = idx - 1; i >= 0; i--) {
            if (arr[i] == 6) {
                num -= tmp[i] * 6;
                num += tmp[i] * 9;
                break;
            }
        }

        return num;
    }
}