class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            switch (current) {
                case '(':
                case '{':
                case '[': stack.push(current); break;
                case ')': if(stack.isEmpty() || stack.pop() != '(') return false; break;
                case '}': if(stack.isEmpty() || stack.pop() != '{') return false; break;
                case ']': if(stack.isEmpty() || stack.pop() != '[') return false; break;
            }
        }

        if (stack.isEmpty()) return true; else return false;
        
    }
}
