class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        for(int r = 0; r < accounts.length; r++)
        {
            int wealth = 0; // for taking sum
            for( int c = 0; c < accounts[r].length; c++)
            {
                wealth += accounts[r][c];
            }
            if(wealth > max)
            {
                max = wealth;
            }
        }

        return max;
        
    }
}