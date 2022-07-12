class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while(left<right){
            int left_value = numbers[left];
            int right_value = numbers[right];
            if(left_value + right_value == target) return new int[] {left+1, right+1};
            
            if(left_value + right_value < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {};
    }
}