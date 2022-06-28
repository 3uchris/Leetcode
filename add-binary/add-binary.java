class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder result = new StringBuilder();//make string mutable 
        
        int i = a.length() - 1;// going backward 
        int j = b.length() - 1; //set the intial value of i and j 
        int carry = 0; 
        
        while(i >= 0 || j >= 0){ //conditons on both i and j going backward stops 
            int sum = carry;   
            if(i >= 0){ 
                sum += a.charAt(i) - '0';
            } // converting a number into a character
            if(j >= 0){ 
                sum += b.charAt(j) - '0'; // update i and j 
            }
            
            result.append(sum % 2); 
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        if (carry != 0){
            result.append(carry);
        }
        
        return result.reverse().toString();
    }
}