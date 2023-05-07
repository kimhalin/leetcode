class Solution {
    public int totalMoney(int n) {
        int week=n/7;  
        int res=0;
        for(int i=1;i<=week;i++){
            res+=7*(i+3);
        }
        for(int i=7*week;i<n;i++){
            res+=++week;
        }
        return res;
    }
}