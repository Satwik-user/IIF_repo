class Solution {
    public boolean isPalindrome(int x) {
        int cpy = x, rev = 0;
        while(x > 0)
        {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        if(cpy == rev)
        return true;
        else
        return false;
    }
}