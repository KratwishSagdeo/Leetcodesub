class Solution {
    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2; // count of even indices
        long odd = n / 2;        // count of odd indices

        long result = (modPow(5, even) * modPow(4, odd)) % MOD;
        return (int) result;
    }

    // Efficient modular exponentiation
    static long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
