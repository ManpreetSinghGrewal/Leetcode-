class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        int[][] dp = new int[n][2];
        
        // Base Cases for Day 0
        dp[0][0] = 0;          // No stock on day 0 -> 0 profit
        dp[0][1] = -prices[0]; // Bought stock on day 0 -> negative profit (spent money)
        
        for (int i = 1; i < n; i++) {
            // State 0: Max profit if we don't hold a stock today
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            
            // State 1: Max profit if we hold a stock today
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        
        // At the final day, the max profit will always be when we don't hold any stock
        return dp[n-1][0];
    }
}
