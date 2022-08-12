class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0 ; i < n+1; i++){
            res[i] = countOnes(i);
        }
        return res;
    }
    
    public int countOnes(int n){
        int one = 1;
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & one) != 0){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}