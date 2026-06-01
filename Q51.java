class Solution {
    public boolean areNumbersAscending(String s) {
        boolean less = true;
        String w = "";
        int prev = 0;

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c == ' ')
            {
                if(Character.isDigit(w.charAt(0)))
                {
                    int num = Integer.parseInt(w);

                    if(num <= prev)
                    return false;

                    prev = num;
                }

                w = "";
            }
            else
            w += c;
        }

        if(Character.isDigit(w.charAt(0)))
        {
            int num = Integer.parseInt(w);
            
            if(num <= prev)
            return false;
        }

        return true;
    }
}