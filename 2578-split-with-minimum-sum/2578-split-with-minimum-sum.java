class Solution {
    public int splitNum(int num) {
        int rem = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0) {
            rem = num % 10;
            list.add(rem);
            num  = num / 10;
        }

        Collections.sort(list);

        String nums1 = "";
        String nums2 = "";

        for(int i = 0; i < list.size(); i = i + 2) {
            nums1 += list.get(i);
        }        

        for(int i = 1; i < list.size(); i = i + 2) {
            nums2 += list.get(i);
        }

        int sum = Integer.parseInt(nums1) + Integer.parseInt(nums2);

        return sum;
    }
}