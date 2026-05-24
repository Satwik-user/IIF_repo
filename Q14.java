class Solution {
    public String countAndSay(int n) {
        if(n == 1)
        return "1";

        String prev = countAndSay(n-1);

        int pairs[][] = getPairs(prev);

        return buildString(pairs);
    }

    private int[][] getPairs(String s)
    {
        int temp[][] = new int[s.length()][2];
        int index = 0, count = 1;

        for(int i=0; i<s.length(); i++)
        {
            while(i<s.length() - 1 && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }

            temp[index][0] = count;
            temp[index][1] = s.charAt(i) - '0';

            index++;
            count = 1; 
        }
        int pairs[][] = new int[index][2];

        for(int i=0; i<index; i++)
        {
            pairs[i][0] = temp[i][0];
            pairs[i][1] = temp[i][1];
        }
        return pairs;
    }

    private String buildString(int pairs[][])
    {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<pairs.length; i++)
        {
            res.append(pairs[i][0]);
            res.append(pairs[i][1]);
        }

        return res.toString();
    }
}