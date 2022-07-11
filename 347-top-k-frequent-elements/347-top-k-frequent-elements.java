class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //create a new hashmap named "bucket1"
        //key:element of nums
        //values: numbers of times the element appear
        HashMap<Integer, Integer> bucket1 = new HashMap<>();
        for(int num : nums){
            bucket1.put(num, bucket1.getOrDefault(num, 0)+1);
        }

        //create a new hashmap named "bucket2"
        //key:numbers of times the element appears(==values of bucket1)
        //values:list of elements
        HashMap<Integer, List<Integer>> bucket2 = new HashMap<>();
        
        
        //.keySet :fetch the value mapped by a #particular# key mentioned in the parameter
        for(int num: bucket1.keySet()){ 
            //values of bucket1 equals frequency
            int freq = bucket1.get(num);
            if(!bucket2.containsKey(freq)) bucket2.put(freq, new ArrayList<>());
            bucket2.get(freq).add(num);
        }

        int[] result = new int[k];
        for(int i = nums.length; i > 0; i--){ // going backward
            if(bucket2.containsKey(i)){ // check frequncy 
                List<Integer> list = bucket2.get(i);
                for(int n : list){
                    result[--k] = n;
                    if(k==0) return result;
                }
            }
        }
        return result;
    }
}