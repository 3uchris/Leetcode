class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>(); // initlize the reuslt list of list
        
        HashMap<String, List<String>> map = new HashMap<>(); // initialize the hashmap
        for(String curr : strs){
            char[] characters = curr.toCharArray();
            Arrays.sort(characters);
            
            String sorted_string = new String(characters);
            if(!map.containsKey(sorted_string)){
                map.put(sorted_string, new ArrayList<>());
            }
            
            map.get(sorted_string).add(curr);
        }
        
        
        result.addAll(map.values());
        return result;
        
    }
}