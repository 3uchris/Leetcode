class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums){
            hashSet.add(num);
        }
        
        int longest = 0;
        
        for (int num : hashSet){
            if (!hashSet.contains(num - 1)) { // check whether the number has a left neighbor
                int currNum = num;
                int count = 1;
                
                while(hashSet.contains(currNum + 1)) { // check whether the number has a right neighbor 
                    currNum++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}