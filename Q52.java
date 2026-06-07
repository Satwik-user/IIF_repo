class Solution {
    public int compareVersion(String version1, String version2) {
        String v1_str[] = version1.split("\\.");
        String v2_str[] = version2.split("\\.");

        int larger_v = (v1_str.length > v2_str.length)? v1_str.length: v2_str.length;
        for(int i=0; i<larger_v; i++)
        {
            int num1 = (i<v1_str.length)? Integer.parseInt(v1_str[i]): 0;
            int num2 = (i<v2_str.length)? Integer.parseInt(v2_str[i]): 0;

            if(num1 < num2)
            return -1;

            if(num1 > num2)
            return 1;
        }
        return 0;
    }
}