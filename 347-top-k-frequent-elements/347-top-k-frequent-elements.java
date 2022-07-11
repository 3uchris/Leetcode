class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> bucket1 = new HashMap<>();
        for(int num:nums){
            bucket1.put(num, bucket1.getOrDefault(num, 0)+1); //key:elements of nums[]
                                                            //value:numbers of times of the key element 
        }
        
        HashMap<Integer,List<Integer>> bucket2 = new HashMap<>(); // create a new hashmap
        for(int num:bucket1.keySet()){
            int freq = bucket1.get(num);//get the ---value--- of bucket1
            if(!bucket2.containsKey(freq)) bucket2.put(freq, new ArrayList<>());
            bucket2.get(freq).add(num); 
        }
        
        int[] result = new int[k];
        for(int i = nums.length; i > 0; i--){
            if(bucket2.containsKey(i)){
                List<Integer> list = bucket2.get(i);
                for(int n : list){
                    result[--k] = n;
                    if(k == 0) return result;
                }
            }
        }
        
        return result;
    }
}