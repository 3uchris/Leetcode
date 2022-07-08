class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //we first define a arraylist that store our final result;
        List<List<Integer>> arr = new ArrayList<>(); 
        Arrays.sort(nums);                // sort the array
        int length = nums.length;
        
        for(int i = 0; i < length; i++){
            if(nums[i] > 0) return arr;   //not possible to sum up to 0 if the smallest value is smaller than zero
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int curr= nums[i];
            int left = i + 1;
            int right = length - 1;
            
            while(left < right){
                int temp = curr + nums[left] + nums[right];
                if(temp == 0){
                    List<Integer> temp_arr = new ArrayList<>();
                    temp_arr.add(curr);
                    temp_arr.add(nums[left]);
                    temp_arr.add(nums[right]);
                    arr.add(temp_arr);
                    
                    while(left < right && nums[left + 1] == nums[left]) ++left;
                    while(left < right && nums[right - 1] == nums[right]) --right;
                
                    ++left;
                    --right;
                }
                else if(temp < 0){
                    ++left;
                }
                else{
                    --right;
                }
            }
        }
        return arr;
    }
}