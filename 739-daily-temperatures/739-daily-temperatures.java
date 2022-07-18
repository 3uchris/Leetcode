class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int length = temperatures.length;
        int[] result = new int[length];
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
}