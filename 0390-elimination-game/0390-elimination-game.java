class Solution {
    public int lastRemaining(int n) {
        return f(n, true);
    }

    private int f(int n, boolean left) {
        if (n == 1) return 1;

        if (left || n % 2 == 1) {
            return 2 * f(n / 2, !left);
        } else {
            return 2 * f(n / 2, !left) - 1;
        }
    }
}
