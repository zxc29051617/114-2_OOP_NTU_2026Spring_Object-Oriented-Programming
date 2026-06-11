import java.util.Stack;

/**
 * Checks whether brackets in a string are correctly matched.
 */
public class ParenthesisMatcher {

    /**
     * Creates a parenthesis matcher.
     */
    public ParenthesisMatcher() {
    }

    /**
     * Determines whether every bracket has the correct matching bracket.
     *
     * @param s the bracket string to check
     * @return {@code true} if all brackets are matched; otherwise {@code false}
     */
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
