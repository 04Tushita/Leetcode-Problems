class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       return nums[nums.length/2]; // returning middle element
    }
}