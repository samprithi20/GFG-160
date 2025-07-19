class Solution {
    public int maximumProfit(int prices[]) {
        int res = 0;
        int minSoFar = prices[0];
        
        for(int i = 1;i < prices.length;i++){
            minSoFar = Math.min(prices[i], minSoFar);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
}