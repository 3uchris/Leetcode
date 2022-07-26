class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        boolean first = true;
        while(first == true || slow != fast){
            if(first == true) first = false;
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        
        int slow2 = nums[0];
        while(slow2 != slow){
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == slow2) return slow;
        }
        
        return slow;
    }
}