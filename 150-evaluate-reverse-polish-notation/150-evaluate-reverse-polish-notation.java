class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operator = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].matches("-?[0-9]+.*[0-9]*")){
                operator.push(Integer.parseInt(tokens[i]));
            } else{
                // 如果遇到了操作符
                // 先判断栈的容量，如果 > 2那么就进行操作，如果 < 2 就直接return 0;
                if(operator.size() >= 2){
                    int pre = operator.pop();
                    int after = operator.pop();
                    switch (tokens[i]){
                        case "+" : operator.push(after + pre);break;
                        case "-" : operator.push(after - pre);break;
                        case "*" : operator.push(after * pre);break;
                        case "/" : operator.push(after / pre);break;
                    }
                }
            }
        }
        return operator.pop();
    }
}