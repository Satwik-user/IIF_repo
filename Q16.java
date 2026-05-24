class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits.length() == 0)
        return res;

        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(digits, 0, new StringBuilder(), res, map);
        
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder cur, List<String> res, String map[])
    {
        if(index == digits.length())
        {
            res.add(cur.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map[digit - '0'];

        for(int i=0; i<letters.length(); i++)
        {
            cur.append(letters.charAt(i));
            backtrack(digits, index+1, cur, res, map);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}