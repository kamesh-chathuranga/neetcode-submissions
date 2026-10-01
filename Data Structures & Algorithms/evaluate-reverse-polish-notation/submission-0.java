class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            Integer operand = getIfOperand(token);

            if(operand != null) {
                stack.push(operand);
            } else {
                Integer num2 = stack.pop();
                Integer num1 = stack.pop();

                switch(token) {
                    case "+" -> {
                        Integer result = num1 + num2;
                        stack.push(result);
                    }
                    case "-" -> {
                        Integer result = num1 - num2;
                        stack.push(result);
                    }
                    case "*" -> {
                        Integer result = num1 * num2;
                        stack.push(result);
                    }
                    case "/" -> {
                        Integer result = num1 / num2;
                        stack.push(result);
                    }
                    default -> 
                    throw new IllegalArgumentException("Invalid operator");
                }
            }
        }

        return stack.pop();
    }

    public Integer getIfOperand(String token) {
        try {
            return Integer.valueOf(token);
        } catch(Exception e) {
            return null;
        }
    }
}
