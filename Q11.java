class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length-1; i++)
        {
            int min_idx = i;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[j] < nums[min_idx])
                min_idx = j;
            }
            if(min_idx != i)
            {
                int temp = nums[min_idx];
                nums[min_idx] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0; i<nums.length-1; i+=2)
        {
            if(nums[i] != nums[i+1])
            return nums[i];
        }
        return nums[nums.length - 1];
    }
}