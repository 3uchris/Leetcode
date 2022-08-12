class Solution {
    public int getSum(int a, int b) {
        while(b != 0){//b is the carry
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;   
        }
        return a;
    }
}