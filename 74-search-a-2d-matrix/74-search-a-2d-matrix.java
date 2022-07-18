class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0) return false;
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        int left = 0;
        int right = row * column - 1;
        
        while(left <= right){
            
            int mid = left + (right - left)/2; //******big num*******
            int midval = matrix[mid/column][mid%column];//*********
            
            if(midval == target) return true;
            else if(midval < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;     
    }
}