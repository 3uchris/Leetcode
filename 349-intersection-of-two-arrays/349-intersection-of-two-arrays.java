class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                intersection.add(nums2[j]);
            }
        }
        int i = 0;
        int[] result = new int[intersection.size()];
        for(int num : intersection){
            result[i++] = num;
        }
        return result;
    }
}