class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    int op2 = operands.pop();
                    int op1 = operands.pop();
                    operands.push(op1 + op2);
                    break;
                case "-":
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.push(op1 - op2);
                    break;
                case "*":
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.push(op1 * op2);
                    break;
                case "/":
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.push(op1 / op2);
                    break;
                default:
                    operands.push(Integer.valueOf(token));
                    break;
            }
        }

        return operands.pop();
    }
}
