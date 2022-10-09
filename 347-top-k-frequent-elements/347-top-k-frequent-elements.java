class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hashMap1 = new HashMap<>();
        for(int num : nums){
            hashMap1.put(num, hashMap1.getOrDefault(num, 0)+1);
        }
        
        Map<Integer, ArrayList<Integer>> hashMap2 = new HashMap<>();
        
        for(int num : hashMap1.keySet()){ // get key list
            int freq = hashMap1.get(num);
            if(!hashMap2.containsKey(freq)){
                hashMap2.put(freq, new ArrayList<>());
            }
            hashMap2.get(freq).add(num);
        }
        
        int[] res = new int[k];
        for(int i = nums.length; 0 < i; i--){
            if(hashMap2.containsKey(i)){
                ArrayList<Integer> arr = hashMap2.get(i);
                for(int n : arr){
                    res[--k] = n;
                    if(k == 0){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}