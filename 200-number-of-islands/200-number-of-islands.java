class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int numRow = grid.length;
        int numColumn = grid[0].length;
        
        int numIsland = 0;
        for(int r = 0; r < numRow; r++){
            for(int c = 0; c < numColumn; c++){
                if(grid[r][c] == '1'){
                    ++numIsland;
                    dfs(grid, r, c);
                }
            }
        }
        return numIsland;
    }
    
    void dfs(char[][] grid, int r, int c){
        int numRow = grid.length;
        int numColumn = grid[0].length;
        
        if(r < 0 || c < 0 || r >= numRow || c >= numColumn || grid[r][c]=='0'){
            return;
        }
        
        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
        
        
    }
}