class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while( i < arr.length)
        {
            int correct = arr[i]; // since from 0 to N
            if(arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        // seaech for missing number
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] nums, int first, int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}