class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int[] s_arr = new int[10];
        int[] g_arr = new int[10];
        
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }else{
                ++s_arr[secret.charAt(i) - '0'];
                ++g_arr[guess.charAt(i) - '0'];
            }
        }
        
        int cows = 0;
        for(int i = 0; i < 10; i++){
            cows += Math.min(s_arr[i], g_arr[i]);
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B"; 
    }
}    
    