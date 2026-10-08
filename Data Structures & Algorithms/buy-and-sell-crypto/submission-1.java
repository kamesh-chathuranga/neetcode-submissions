class Solution {
    public int maxProfit(int[] prices) {
        int s = 0;
        int maxProfit = 0;

        for(int e = 1; e < prices.length; e++) {
            int currProfit = prices[e] - prices[s];

            if(currProfit <= 0) {
                s = e;
            }

            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }
}
