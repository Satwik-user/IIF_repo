import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();

        
        int nums1[] = new int[m + n];
        int nums2[] = new int[n];
        
        for(int i=0; i<m; i++)
            nums1[i] = sc.nextInt();
        
        int nums1_cpy[] = new int[m];
        for(int i=0; i<m; i++)
            nums1_cpy[i] = nums1[i];
        for(int i=0; i<m+n; i++)
            nums1[i] = 0;
        
        for(int i=0; i<n; i++)
            nums2[i] = sc.nextInt();
        
        Arrays.sort(nums1_cpy);
        Arrays.sort(nums2);
                
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n)
        {
            if(nums1_cpy[i] < nums2[j])
                nums1[k++] = nums1_cpy[i++];
            else
                nums1[k++] = nums2[j++];
        }
        
        while(i < m)
            nums1[k++] = nums1_cpy[i++];
        
        while(j < n)
            nums1[k++] = nums2[j++];

        System.out.println(Arrays.toString(nums1));
    }
}