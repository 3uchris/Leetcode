class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s:strs){
            char[] characters = s.toCharArray(); // converts a given string into a sequence of characters 
            Arrays.sort(characters); //sort the order of the characters
            
            String key = new String(characters); // convert the sorted characters into string and use it as a key
            
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            //if the map does not contain the key, we add the key to the hashmap and generate the value of arraylist 
            map.get(key).add(s);
            //get the value using key, and add the unrevised string as value
        }
        
        return new ArrayList(map.values()); //ignore the key, and put the values into a new array
    }
}

