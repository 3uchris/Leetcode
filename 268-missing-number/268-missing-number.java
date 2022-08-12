class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        sum = nums.length*(nums.length+1)/2;
        
        return sum - total;
    }
}