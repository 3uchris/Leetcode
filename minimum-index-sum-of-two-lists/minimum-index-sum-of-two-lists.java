class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> hashMap = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        
        for(int i = 0; i < list1.length; i++){
            hashMap.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++){
            Integer j = hashMap.get(list2[i]);
            if(j != null && j + i <= minSum){
                if(i + j < minSum){
                    res.clear();
                    minSum = i+j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}