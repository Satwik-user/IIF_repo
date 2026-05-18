class Solution {
    public boolean isPowerOfFour(int n) {
        double eval = Math.log(n) / Math.log(4);
        if(eval % 1 == 0)
        return true;

        return false;
    }
}