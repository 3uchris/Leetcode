class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //show each element's apperance in the table
        HashMap<Integer, Integer> bucket1 = new HashMap<>();
        for(int num : nums){
            bucket1.put(num, bucket1.getOrDefault(num, 0)+1); // count the numbers of times the element's apperance in the table 
        }

        HashMap<Integer, List<Integer>> bucket2 = new HashMap<>();
        for(int num: bucket1.keySet()){
            int elementFreq = bucket1.get(num);
            if(!bucket2.containsKey(elementFreq)) bucket2.put(elementFreq, new ArrayList<>());
            bucket2.get(elementFreq).add(num);
        }

        int[] result = new int[k];
        for(int i = nums.length; i > 0; i--){
            if(bucket2.containsKey(i)){
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