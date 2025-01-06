class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char s1 = coordinate1.charAt(0);
        char s2 = coordinate2.charAt(0);
        int x = coordinate1.charAt(1) - '0';
        int y = coordinate2.charAt(1) - '0';

        boolean color1 = (s1 - 'a' + x) % 2 == 0;
        boolean color2 = (s2 - 'a' + y) % 2 == 0;
        
        return color1 == color2;
    }
}
