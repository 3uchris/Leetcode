class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder content = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                content.append(s.charAt(i));
            }
        }
        
        content = new StringBuilder(content.toString().toLowerCase());
        String str = content.toString();
        
        return str.equals(content.reverse().toString());
    }
}