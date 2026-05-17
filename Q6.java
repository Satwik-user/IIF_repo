class Solution {
    public int strStr(String haystack, String needle) {
        int haystack_len = haystack.length();
        int needle_len = needle.length();

        for(int i=0; i<=haystack_len-needle_len; i++)
        {
            boolean match = true;
            for(int j=0; j<needle_len; j++)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    match = false;
                    break;
                }
            }

            if(match)
            return i;
        }
        return -1;
    }
}