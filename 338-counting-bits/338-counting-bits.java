class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i < n+1; i++){
            res[i] = countOnes(i);
        }
        return res;
    }
    
    public int countOnes(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n&(n-1); //make the last digit of binary number to be zero, and the assignment work as an increament.
        }
        return count;
    }
    
}