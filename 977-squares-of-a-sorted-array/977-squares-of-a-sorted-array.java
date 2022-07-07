class Solution {
    public int[] sortedSquares(int[] nums) {
        //two pointer method
        int n = nums.length;
        int positive_pointer = 0;
        
        while(positive_pointer < n && nums[positive_pointer] < 0){
            positive_pointer = positive_pointer + 1;
        }
        
        int negative_pointer = positive_pointer - 1;
        int[] arr = new int[n];
        int counter = 0;
        
        while(negative_pointer >= 0 && positive_pointer < n){
            if(nums[negative_pointer] * nums[negative_pointer] < nums[positive_pointer] * nums[positive_pointer]){
                arr[counter] = nums[negative_pointer] * nums[negative_pointer];
                negative_pointer--;
            }else{
                arr[counter] = nums[positive_pointer] * nums[positive_pointer];
                positive_pointer++;
            }
            counter++;
        }
        
        while(negative_pointer >= 0){
            arr[counter] = nums[negative_pointer] * nums[negative_pointer];
            negative_pointer--;
            counter++; 
        }
        
        while(positive_pointer < n){
            arr[counter] = nums[positive_pointer] * nums[positive_pointer];
            positive_pointer++;
            counter++; 
        }
        
        return arr;
        
    }
}