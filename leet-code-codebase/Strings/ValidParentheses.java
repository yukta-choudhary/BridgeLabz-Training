// Valid Parentheses -  Given a string with (), {}, [], check if brackets are valid and balanced.

import java.util.Stack;

class ValidParentheses {

    static boolean isValid(String s) {

        // stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // loop through each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // if closing bracket
            else {
                // if stack empty, no matching opening
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                // check matching pair
                if (ch == ')' && top != '(')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
                if (ch == ']' && top != '[')
                    return false;
            }
        }

        // valid only if stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([])";

        // check and print result
        System.out.println(isValid(s));
    }
}
