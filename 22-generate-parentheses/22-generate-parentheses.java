class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_array = new ArrayList<>();
        Backtrack(output_array, "", 0, 0, n);
        return output_array;
    }
    
    public void Backtrack(List<String> output_array, String str, int open, int close, int max){
        if(str.length() == max*2){
            output_array.add(str);
            return;
        }
        if(open < max){
            Backtrack(output_array, str+'(', open+1, close, max);
        }
        if(open > close){
            Backtrack(output_array, str+')', open, close+1, max);
        }
    }
}