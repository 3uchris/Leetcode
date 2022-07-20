public class Solution {
    public int findMin(int[] nums) {
        int length = nums.length;
        if(length == 0 || nums == null) return 0;
        if(length == 1) return nums[0];
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            
            if(nums[left] <= nums[mid] && nums[right] < nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return nums[left];
    }
}