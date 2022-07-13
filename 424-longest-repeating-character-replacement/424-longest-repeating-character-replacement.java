class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 0) return 0;
        
        int[] map = new int[26];
        char[] chars = s.toCharArray();
        
        int left = 0;
        int right = 0;
        int max = 0;
        
        for(right = 0; right < s.length(); right++){
            int index = chars[right] - 'A';
            map[index]++;
            max = Math.max(max, map[index]);
            if(right - left + 1 > max + k){
                map[chars[left]-'A']--;
                left++;
            }
        }
        return chars.length - left;
    }
}