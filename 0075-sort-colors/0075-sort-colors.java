class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums,low, mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums,mid, high);
                high--;
            }
        }
    }

    static void swap(int[] nums, int f, int s)
    {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}