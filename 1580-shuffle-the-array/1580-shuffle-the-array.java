class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int k = 0, j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0 || i % 2 == 0) // even position
            {
                ans [k] = nums[j];
                k++;
                j++;
            }
            else
            {
                ans[k] = nums[n];
                n++;
                k++;
            }
        }
        return ans;
    }
}