class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int x : nums){
            if(!hashSet.add(x)){
                return true;
            }
        }
        return false;
    }
}