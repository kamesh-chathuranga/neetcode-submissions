public class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        // "([{}])"

        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                if  (stack.isEmpty() || ch != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public boolean isOpenBracket (char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}