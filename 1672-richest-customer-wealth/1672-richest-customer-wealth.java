class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int[] customers:accounts) {
            int sum = 0;
            for(int account:customers) {
                sum+= account;
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}