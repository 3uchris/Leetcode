class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 1;  //set i to 1 in this case 
        for(int j = 0; j < nums.length-1; j++){ //loop through till the last two elements
            if(nums[j] != nums[j+1]){ 
                nums[i] = nums[j+1]; 
                i++;
            }
        }
        return i;
    }
}