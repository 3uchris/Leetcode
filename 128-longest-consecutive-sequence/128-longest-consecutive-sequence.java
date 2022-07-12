class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // initalize the hashset

        for(int num : nums){
            set.add(num);          //add every element to the HashSet 
        }
        
        int longestSequence = 0;   //the length of the longest consecutive elements sequence
        
        for(int num : set){       // for every element in the set 
            if(!set.contains(num - 1)){         //check the element has no left neighour 
                int curr_num = num;             
                int count = 1;
                
                while(set.contains(curr_num + 1)){ //then check whether the current number+1 is in the set 
                    curr_num++;             //stop until there is no right neighbour
                    count++;
                }
                longestSequence = Math.max(longestSequence, count); //updates longest sequence;
            }
        }
        return longestSequence;
    }
}
