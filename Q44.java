class Solution {
    public int minCapability(int[] nums, int k) {
        int l = nums[0], r = nums[0];
        for (int num : nums)
        {
            l = Math.min(l, num);
            r = Math.max(r, num);
        }

        int ans = r;
        while (l <= r)
        {
            int mid = l + (r - l) / 2;
            if (canRob(nums, k, mid))
            {
                ans = mid;
                r = mid - 1;
            }
            else
            l = mid + 1;
        }

        return ans;
    }

    private boolean canRob(int nums[], int k, int cap)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] <= cap)
            {
                count++;
                i++;
            }
        }
        return count >= k;
    }
}