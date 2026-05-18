class Solution {
    public int value(char ch)
    {
        if(ch == 'M')
        return 1000;
        if(ch == 'D')
        return 500;
        if(ch == 'C')
        return 100;
        if(ch == 'L')
        return 50;
        if(ch == 'X')
        return 10;
        if(ch == 'V')
        return 5;
        if(ch == 'I')
        return 1;

        return -1;
    }

    public int romanToInt(String s) {
        int integer = 0;
        for(int i=0; i<s.length(); i++)
        {
            int val1 = value(s.charAt(i));
            if(i+1 < s.length())
            {
                int val2 = value(s.charAt(i+1));
                
                if(val1 >= val2)
                integer += val1;
                else
                {
                    integer += val2 - val1;
                    i++;
                }
            }
            else
            integer += val1;
        }

        return integer;
    }
}