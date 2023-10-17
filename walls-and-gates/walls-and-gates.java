class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
    private static final int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    
    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;
        if (m == 0) return;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                if(rooms[row][column] == GATE) {
                    queue.add(new int[] {row, column});
                }
            }
        }
        
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int row = point[0];
            int column = point[1];
            
            for (int[] direction : directions) {
                int r = row + direction[0];
                int c = column + direction[1];
                
                if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) {
                    continue;
                }
                rooms[r][c] = rooms[row][column] + 1;
                queue.add(new int[] {r, c});
            }
        }
    }
}