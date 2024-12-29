class Solution {
    public boolean canAliceWin(int n) {
        int currentMove = 10;
        boolean isAliceTurn = true;

        while (n > 0) {
            if (n < currentMove) {
                return !isAliceTurn;
            }
            n -= currentMove;
            currentMove--;
            isAliceTurn = !isAliceTurn;
        }

        return !isAliceTurn;
    }
}
