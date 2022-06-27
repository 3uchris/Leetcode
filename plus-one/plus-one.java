class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){ // 从最后一个element往后loop
            if(digits[i]<9){   //如果最后一个element不是9
                digits[i]++;   //最后一个element + 1
                return digits; //break loop，返回加1后的array
            }
            digits[i] = 0; //如果是9把他assign0
        }
        
        int result[] = new int[digits.length+1]; //如果for loop一遍发现都是9，无法breakloop return array
        result[0] = 1; 
        return result; //int values in an array are initialized to zero.
    }
}