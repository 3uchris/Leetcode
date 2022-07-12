class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        
        for(int i = 0; i < length; i++){
            
            //counter case1: if the smallest element is larger than 0, not possible to sum up to 0
            if(nums[i] > 0) return arr;
            
            //counter case2: must not contian duplicate triplets
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            
            int curr = nums[i];     //use two pointer to solve this question
            int left = i + 1;
            int right = length - 1;
            
            while(left<right){
                int temp = curr + nums[left] + nums[right];
                //case1 : sum = 0
                if(temp == 0){
                    List<Integer> temp_arr = new ArrayList<>();
                    temp_arr.add(curr);
                    temp_arr.add(nums[left]);
                    temp_arr.add(nums[right]);
                    
                    arr.add(temp_arr);
                    
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    ++left;
                    --right;
                }
                else if(temp < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return arr;
    }
}