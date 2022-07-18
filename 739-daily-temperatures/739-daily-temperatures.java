class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int length = temperatures.length;
        Stack<Integer> stack = new Stack<>(); // initialize a empty stack;
        int[] result = new int[length];       // result array
        
        for(int i = 0; i < length; i++){ //here the stack stores index
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int prevIndex = stack.pop(); 
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
}