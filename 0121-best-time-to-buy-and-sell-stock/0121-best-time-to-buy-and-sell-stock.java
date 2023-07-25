class Solution {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int p = 0;
        int mp = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < least)
            {
                least = prices[i];
            }

            p = prices[i] - least;
            if(mp < p)
            {
                mp = p;
            }
        }
        return mp;
    }
}