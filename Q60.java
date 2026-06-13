class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res_len = nums1.length + nums2.length;
        int res[] = new int[res_len];

        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
            res[k++] = nums1[i++];

            else
            res[k++] = nums2[j++];
        }
        
        while(i < nums1.length)
        res[k++] = nums1[i++];

        while(j < nums2.length)
        res[k++] = nums2[j++];



        if(res_len % 2 == 0)
        return (res[(res_len / 2) - 1] + res[res_len / 2]) / 2.0;

        else
        return res[(res_len - 1) / 2];
    }
}