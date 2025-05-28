class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int rows = 0;rows<9;rows++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int col = 0;col<9;col++){
                char current = board[rows][col];
                if(current != '.'){
                    map.put(current,map.getOrDefault(current,0)+1);
                    if(map.get(current) > 1) return false;
                }
            }
        }
        for (int col = 0; col < 9; col++) {
            Map<Character, Integer> map = new HashMap<>();
                for (int row = 0; row < 9; row++) {
                    char current = board[row][col];
                    if (current != '.') {
                    map.put(current, map.getOrDefault(current, 0) + 1);
                    if (map.get(current) > 1) return false;
                }
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
    for (int boxCol = 0; boxCol < 9; boxCol += 3) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char current = board[boxRow + i][boxCol + j];
                if (current != '.') {
                    map.put(current, map.getOrDefault(current, 0) + 1);
                    if (map.get(current) > 1) return false;
                }
            }
        }
    }
}
    return true;
    }
}