import java.util.Stack;

public class ParenthesisMatcher {

    public static boolean isValid(String s) {
        // Use a Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // If it's an opening bracket, push to stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check for mismatch
                if (current == ')' && top != '(') return false;
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}