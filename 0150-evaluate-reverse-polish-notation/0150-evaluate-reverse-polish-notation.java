class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        // 숫자 스택 사용
        for (String token: tokens) {
            if (token.matches("[-+]?\\d*\\.?\\d+")) {
                stack.push(Integer.parseInt(token));
                continue;
            }
            int first = stack.pop();
            int second = stack.pop();
            switch(token) {
                case "+":
                    stack.push(first+second);
                    break;
                case "-":
                    stack.push(second-first);
                    break;
                case "*":
                    stack.push(first*second);
                    break;
                case "/":
                    stack.push(second/first);
                    break;                                                        
            }
        }
        return stack.peek();
    }
}