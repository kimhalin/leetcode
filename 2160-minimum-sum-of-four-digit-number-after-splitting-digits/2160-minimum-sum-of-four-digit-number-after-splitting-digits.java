class Solution {
    public int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();

        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }


        Collections.sort(list);

        int ans = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i < 2)
                ans += (list.get(i) * 10);
            else
                ans += list.get(i);
        }

        return ans;
    }
}