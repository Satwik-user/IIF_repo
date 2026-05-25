class Solution {
    long MOD = 1000000007;
    public int monkeyMove(int n) {
        long ans = power(2, n);

        ans = (ans - 2 + MOD) % MOD;

        return (int) ans;
    }

    public long power(long x, long n)
    {
        long result = 1;

        while (n > 0) {

            if ((n & 1) == 1)
            result = (result * x) % MOD;

            x = (x * x) % MOD;

            n >>= 1;
        }

        return result;
    }
}