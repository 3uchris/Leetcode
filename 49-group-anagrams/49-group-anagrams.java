class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> hashMap = new HashMap<>();
        
        for(String str : strs){
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);
            
            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(str);
        }
        return new ArrayList(hashMap.values());
    }
}