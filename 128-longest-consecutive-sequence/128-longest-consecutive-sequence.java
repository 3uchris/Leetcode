class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max_sequence_length = 0;

        for(int i = 0; i < nums.length; i++){
            int current_sum = nums[i];
            int current_sequence_length = 1;

            if(!set.contains(current_sum-1)){
                while(set.contains(current_sum+1)){
                    current_sum += 1;
                    current_sequence_length += 1;
                }
                max_sequence_length = Math.max(max_sequence_length, current_sequence_length);
            }
        }
        return max_sequence_length;
    }
}