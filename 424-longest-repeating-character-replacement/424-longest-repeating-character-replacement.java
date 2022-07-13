class Solution {
    public int characterReplacement(String s, int k) {
        int length = s.length();
        int[] freq = new int[26];
        
        int max = 0;
        int left = 0;
        int right = 0;
         while(right < length){
             int index = s.charAt(right) - 'A';
             freq[index]++;
             max = Math.max(max, freq[index]);
             right++;
             
             if(right - left > max + k){
                 freq[s.charAt(left) - 'A']--;
                 left++;
             }
             
        }
        return right - left;
    }
}
