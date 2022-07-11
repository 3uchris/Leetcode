class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] column = new int[9][10];
        int[][] box = new int[9][10];
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue; 
                // if the value of the matrix is . then we skip this iteration
                int curr = board[i][j] - '0';
                if(row[i][curr] == 1) return false;
                if(column[j][curr] == 1) return false;
                if(box[j/3 +(i/3)*3][curr] == 1) return false;
                
                row[i][curr] = 1;
                column[j][curr] = 1;
                box[j/3+(i/3)*3][curr] = 1;
                   
            }   
        }
        return true;
    }
}