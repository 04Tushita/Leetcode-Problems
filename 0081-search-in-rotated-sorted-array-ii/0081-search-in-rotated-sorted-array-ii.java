class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while(s <= e)
        {
            int m = s + (e - s)/2;
            if(nums[m] == target)
            {
                return true;
            }
            if(nums[s] == nums[m] && nums[m] == nums[e]) // If there are duplicates
            {
                s ++;
                e --;
            }
            else if(nums[s] <= nums[m]) // left half is sorted
            {
                if(target >= nums[s] && target <= nums[m])
                {
                     e = m - 1;
                }
                else
                {
                    s = m + 1;
                }
            }
            else // right half is sorted
            {
                if(target <= nums[e] && target >= nums[m])
                {
                    s = m + 1;
                }
                else
                {
                    e = m - 1;
                }
            }
        }
        return false;
    }
}