class Solution {
    public int maxProfit(int[] prices) {
        int max = prices.length-1;
        int profit = 0;
        for(int i = prices.length-1; i>=0 ;i--)
        {
            if(prices[i]>prices[max])
                max = i;
            profit = Math.max(profit,Math.abs(prices[i]-prices[max]));
        }
        return profit;
    }
}
