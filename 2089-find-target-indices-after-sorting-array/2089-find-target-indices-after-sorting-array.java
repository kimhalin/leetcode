class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int start=0, cnt=0;    
        for(int n : nums){
            if(n<target)
                start++;
            else if(n==target)
                cnt++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int t=0;t<cnt;t++)
            ans.add(start++);
    
        return ans;
    }
}